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

If ($Args.Count -lt 1) {
    Get-Usage
    return
}

$Tail = $Args[1..($Args.Count - 1)]
$Tail = $Tail -join " "

switch ($Args[0].ToLower()) {
    "antlr4" { "java -jar ./dependencies/antlr-4.13.0-complete.jar " + $Tail | Invoke-Expression }
    "compile" { javac -Xlint:deprecation -cp ".;./dependencies/antlr-4.13.0-complete.jar" -d ".target/" *.java }
    "run" { "java -cp `".target/;./dependencies/antlr-4.13.0-complete.jar`" App " + $Tail | Invoke-Expression }
    Default { Get-Usage }
}
