[CmdletBinding()]
param(
    [string]$ProjectRoot = (Get-Location).Path,
    [string]$InputJar = "build\phobos-input.jar",
    [string]$OutputDir = "decompiled-src",
    [switch]$Clean
)

$ErrorActionPreference = "Stop"

function Get-FullPath([string]$BasePath, [string]$ChildPath) {
    return [System.IO.Path]::GetFullPath((Join-Path $BasePath $ChildPath))
}

function New-Directory([string]$PathValue) {
    if (-not (Test-Path -LiteralPath $PathValue)) {
        New-Item -ItemType Directory -Path $PathValue | Out-Null
    }
}

function Ensure-Cfr([string]$ToolsDir) {
    $jarPath = Get-FullPath $ToolsDir "cfr.jar"
    if (-not (Test-Path -LiteralPath $jarPath)) {
        New-Directory $ToolsDir
        Write-Host "Downloading CFR..."
        Invoke-WebRequest -Uri "https://www.benf.org/other/cfr/cfr-0.152.jar" -OutFile $jarPath
    }
    return $jarPath
}

Push-Location -LiteralPath $ProjectRoot
try {
    $root = (Resolve-Path ".").Path
    $inputJarPath = Get-FullPath $root $InputJar
    $outputPath = Get-FullPath $root $OutputDir
    $cfrJar = Ensure-Cfr (Get-FullPath $root ".tools\decompiler")

    if (-not (Test-Path -LiteralPath $inputJarPath)) {
        throw "Input jar not found: $inputJarPath"
    }

    if ($Clean -and (Test-Path -LiteralPath $outputPath)) {
        Remove-Item -LiteralPath $outputPath -Recurse -Force
    }

    New-Directory $outputPath

    Write-Host "Decompiling $inputJarPath ..."
    & java -jar $cfrJar $inputJarPath `
        --outputdir $outputPath `
        --caseinsensitivefs true `
        --silent true `
        --comments false `
        --forcetopsort true `
        --forcetopsortaggress true `
        --removebadgenerics false `
        --removeboilerplate true `
        --renameillegalidents true `
        --showversion false

    if ($LASTEXITCODE -ne 0) {
        throw "CFR failed with exit code $LASTEXITCODE"
    }

    Write-Host ""
    Write-Host "Done."
    Write-Host "Input : $inputJarPath"
    Write-Host "Output: $outputPath"
}
finally {
    Pop-Location
}
