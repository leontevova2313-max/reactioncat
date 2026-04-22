[CmdletBinding()]
param(
    [string]$ProjectRoot = (Get-Location).Path,
    [string]$InputDir = "decompiled-src",
    [string]$OutputDir = "decompiled-readable"
)

$ErrorActionPreference = "Stop"

Push-Location -LiteralPath $ProjectRoot
try {
    Write-Host "Compiling readable-source generator..."
    & javac .\tools\MakeReadableSources.java
    if ($LASTEXITCODE -ne 0) {
        throw "javac failed with exit code $LASTEXITCODE"
    }

    Write-Host "Generating readable source tree..."
    & java -cp .\tools MakeReadableSources $InputDir $OutputDir
    if ($LASTEXITCODE -ne 0) {
        throw "generator failed with exit code $LASTEXITCODE"
    }

    Write-Host ""
    Write-Host "Done."
    Write-Host "Input : $InputDir"
    Write-Host "Output: $OutputDir"
}
finally {
    Pop-Location
}
