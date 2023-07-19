# Create the target directory if it doesn't exist
if (-Not (Test-Path ".target/")) {
    New-Item -ItemType Directory -Force -Path ".target/" | Out-Null
}

function Get-Usage {
    Write-Output "Usage: ./compiler.ps1 [command] [args]"
    Write-Output "Commands:"
    Write-Output "  antlr4 [args]  Pass the command to the ANTLR4 tool"
    Write-Output "  compile        Compile the generated code"
    Write-Output "  run [args]     Run the compiled code"
}

function Get-Tail {
    param (
        [Parameter(Mandatory=$false, Position=0)]
        [string[]]$Args
    )
    $Args | Format-List | Select-Object -Skip 1
}

If ($Args.Count -lt 1) {
    Get-Usage
    return
}

$Tail = Get-Tail $Args | Out-String

switch ($Args[0].ToLower()) {
    "antlr4" { "java -jar ./dependencies/antlr-4.13.0-complete.jar " + $Tail | Invoke-Expression }
    "compile" { javac -cp ".;./dependencies/antlr-4.13.0-complete.jar" -d ".target/" *.java }
    "run" { "java -cp `".target/;./dependencies/antlr-4.13.0-complete.jar`" App " + $Tail | Invoke-Expression }
    Default { Get-Usage }
}
