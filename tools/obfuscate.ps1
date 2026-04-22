[CmdletBinding()]
param(
    [string]$ProjectRoot = (Get-Location).Path,
    [string]$BuildDir = "build",
    [string]$ProGuardVersion = "7.4.2",
    [switch]$Clean
)

$ErrorActionPreference = "Stop"

function Get-FullPath([string]$BasePath, [string]$ChildPath) {
    return [System.IO.Path]::GetFullPath((Join-Path $BasePath $ChildPath))
}

function Convert-ToProGuardPath([string]$PathValue) {
    return ($PathValue -replace "\\", "/")
}

function New-Directory([string]$PathValue) {
    if (-not (Test-Path -LiteralPath $PathValue)) {
        New-Item -ItemType Directory -Path $PathValue | Out-Null
    }
}

function Get-JavaHome() {
    $javaCommand = Get-Command java
    return Split-Path -Parent (Split-Path -Parent $javaCommand.Source)
}

function Ensure-ProGuard([string]$ToolsDir, [string]$Version) {
    $installRoot = Get-FullPath $ToolsDir "proguard-$Version"
    $jarPath = Get-FullPath $installRoot "lib\proguard.jar"
    if (Test-Path -LiteralPath $jarPath) {
        return $jarPath
    }

    New-Directory $ToolsDir
    $archivePath = Get-FullPath $ToolsDir "proguard-$Version.zip"
    $expandedRoot = Get-FullPath $ToolsDir "expanded-$Version"
    $downloadUrl = "https://github.com/Guardsquare/proguard/releases/download/v$Version/proguard-$Version.zip"

    Write-Host "Downloading ProGuard $Version..."
    Invoke-WebRequest -Uri $downloadUrl -OutFile $archivePath

    if (Test-Path -LiteralPath $expandedRoot) {
        Remove-Item -LiteralPath $expandedRoot -Recurse -Force
    }

    Expand-Archive -Path $archivePath -DestinationPath $expandedRoot -Force

    $extractedDir = Get-ChildItem -LiteralPath $expandedRoot -Directory | Select-Object -First 1
    if (-not $extractedDir) {
        throw "ProGuard archive did not contain an installation directory."
    }

    if (Test-Path -LiteralPath $installRoot) {
        Remove-Item -LiteralPath $installRoot -Recurse -Force
    }

    Move-Item -LiteralPath $extractedDir.FullName -Destination $installRoot
    Remove-Item -LiteralPath $expandedRoot -Recurse -Force

    if (-not (Test-Path -LiteralPath $jarPath)) {
        throw "ProGuard jar was not found after extraction: $jarPath"
    }

    return $jarPath
}

function Get-KeepClasses([string]$RootPath) {
    $keepClasses = [System.Collections.Generic.HashSet[string]]::new()

    $fabricJsonPath = Get-FullPath $RootPath "fabric.mod.json"
    $fabricConfig = Get-Content -LiteralPath $fabricJsonPath -Raw | ConvertFrom-Json

    foreach ($entrypointGroup in $fabricConfig.entrypoints.PSObject.Properties) {
        foreach ($entrypoint in $entrypointGroup.Value) {
            [void]$keepClasses.Add([string]$entrypoint)
        }
    }

    foreach ($mixinConfigName in $fabricConfig.mixins) {
        $mixinConfigPath = Get-FullPath $RootPath $mixinConfigName
        $mixinConfig = Get-Content -LiteralPath $mixinConfigPath -Raw | ConvertFrom-Json
        $packagePrefix = [string]$mixinConfig.package

        foreach ($listName in @("mixins", "client", "server")) {
            $listValue = $mixinConfig.$listName
            if ($null -eq $listValue) {
                continue
            }

            foreach ($className in $listValue) {
                [void]$keepClasses.Add("$packagePrefix.$className")
            }
        }
    }

    foreach ($extraClass in @(
        "org.phobos.openapi.OpenAPI",
        "org.phobos.openapi.OpenAPIProvider",
        "org.phobos.openapi.OpenModule",
        "org.phobos.openapi.OpenSetting",
        "org.phobos.core.input.Keys"
    )) {
        [void]$keepClasses.Add($extraClass)
    }

    return @($keepClasses | Sort-Object)
}

function Get-KeepPackages([string[]]$KeepClasses) {
    $keepPackages = [System.Collections.Generic.HashSet[string]]::new()

    foreach ($className in $KeepClasses) {
        $lastDot = $className.LastIndexOf(".")
        if ($lastDot -lt 0) {
            continue
        }

        $packageName = $className.Substring(0, $lastDot)
        [void]$keepPackages.Add($packageName)
    }

    foreach ($packageName in @(
        "org.phobos.mixin",
        "org.phobos.drm",
        "org.phobos.openapi",
        "org.phobos.core",
        "org.earthhack.ducks",
        "org.earthhack.mixin",
        "net.sydneyclient.phobos",
        "engine.external.runtime",
        "engine.linking",
        "com.phobos.dvts"
    )) {
        [void]$keepPackages.Add($packageName)
    }

    return @($keepPackages | Sort-Object)
}

function New-ProGuardConfig(
    [string]$ConfigPath,
    [string]$InputJar,
    [string]$OutputJar,
    [string]$MappingPath,
    [string]$ProjectPath,
    [string]$JavaHome,
    [string[]]$KeepClasses,
    [string[]]$KeepPackages
) {
    $lines = [System.Collections.Generic.List[string]]::new()

    $lines.Add("-injars '" + (Convert-ToProGuardPath $InputJar) + "'")
    $lines.Add("-outjars '" + (Convert-ToProGuardPath $OutputJar) + "'")

    Get-ChildItem -LiteralPath (Get-FullPath $JavaHome "jmods") -Filter *.jmod | Sort-Object Name | ForEach-Object {
        $jmodPath = Convert-ToProGuardPath $_.FullName
        $lines.Add("-libraryjars '$jmodPath'")
    }

    $lines.Add("-dontshrink")
    $lines.Add("-dontoptimize")
    $lines.Add("-dontpreverify")
    $lines.Add("-dontwarn")
    $lines.Add("-ignorewarnings")
    $lines.Add("-useuniqueclassmembernames")
    $lines.Add("-allowaccessmodification")
    $lines.Add("-overloadaggressively")
    $lines.Add("-mergeinterfacesaggressively")
    $lines.Add("-adaptclassstrings")
    $lines.Add("-repackageclasses 'x'")
    $lines.Add("-renamesourcefileattribute Source")
    $lines.Add("-keepattributes Exceptions,InnerClasses,Signature,Deprecated,SourceFile,LineNumberTable,*Annotation*,EnclosingMethod,Record,PermittedSubclasses")
    $lines.Add("-adaptresourcefilecontents **.json,**.accesswidener,META-INF/MANIFEST.MF")
    $lines.Add("-printmapping '" + (Convert-ToProGuardPath $MappingPath) + "'")

    if ($KeepPackages.Count -gt 0) {
        $lines.Add("-keeppackagenames " + ($KeepPackages -join ","))
    }

    foreach ($keepClass in $KeepClasses) {
        $lines.Add("-keep class $keepClass { *; }")
    }

    Set-Content -LiteralPath $ConfigPath -Value $lines -Encoding ASCII
}

Push-Location -LiteralPath $ProjectRoot
try {
    $root = (Resolve-Path ".").Path
    $buildPath = Get-FullPath $root $BuildDir
    $toolsPath = Get-FullPath $root ".tools"
    $configPath = Get-FullPath $buildPath "proguard.pro"
    $inputJar = Get-FullPath $buildPath "phobos-input.jar"
    $outputJar = Get-FullPath $buildPath "phobos-obfuscated.jar"
    $mappingPath = Get-FullPath $buildPath "mapping.txt"
    $javaHome = Get-JavaHome
    $jarExe = (Get-Command jar).Source
    $proGuardJar = Ensure-ProGuard -ToolsDir $toolsPath -Version $ProGuardVersion

    if ($Clean -and (Test-Path -LiteralPath $buildPath)) {
        Remove-Item -LiteralPath $buildPath -Recurse -Force
    }

    New-Directory $buildPath

    $packageItems = @(
        "assets",
        "club",
        "com",
        "darwin",
        "engine",
        "io",
        "linux",
        "linux-x86-64",
        "macos",
        "META-INF",
        "net",
        "org",
        "win32-x86",
        "win32-x86-64",
        "windows",
        "fabric.mod.json",
        "icon.png",
        "phoboslite-refmap.json",
        "phoboslite.accesswidener",
        "phoboslite.mixins.json"
    ) | Where-Object { Test-Path -LiteralPath (Get-FullPath $root $_) }

    if ($packageItems.Count -eq 0) {
        throw "No mod files were found to package."
    }

    if (Test-Path -LiteralPath $inputJar) {
        Remove-Item -LiteralPath $inputJar -Force
    }

    Write-Host "Packaging input jar..."
    & $jarExe --create --file $inputJar @packageItems
    if ($LASTEXITCODE -ne 0) {
        throw "jar packaging failed with exit code $LASTEXITCODE"
    }

    $keepClasses = Get-KeepClasses -RootPath $root
    $keepPackages = Get-KeepPackages -KeepClasses $keepClasses
    New-ProGuardConfig -ConfigPath $configPath -InputJar $inputJar -OutputJar $outputJar -MappingPath $mappingPath -ProjectPath $root -JavaHome $javaHome -KeepClasses $keepClasses -KeepPackages $keepPackages

    if (Test-Path -LiteralPath $outputJar) {
        Remove-Item -LiteralPath $outputJar -Force
    }

    Write-Host "Running ProGuard..."
    & java -jar $proGuardJar "@$configPath"
    if ($LASTEXITCODE -ne 0) {
        throw "ProGuard failed with exit code $LASTEXITCODE"
    }

    Write-Host ""
    Write-Host "Done."
    Write-Host "Input jar : $inputJar"
    Write-Host "Output jar: $outputJar"
    Write-Host "Mapping   : $mappingPath"
}
finally {
    Pop-Location
}
