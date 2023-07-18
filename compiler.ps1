param([string]$command="help")

# Create the target directory if it doesn't exist
if (-Not (Test-Path ".target/")) {
    New-Item -ItemType Directory -Force -Path ".target/" | Out-Null
}

switch ($command.ToLower()) {
    "antlr4" { java -jar ./dependencies/antlr-4.13.0-complete.jar $args[2..0] }
    "compile" { javac -cp ".;./dependencies/antlr-4.13.0-complete.jar" -d ".target/" *.java }
    "run" { java -cp ".target/;./dependencies/antlr-4.13.0-complete.jar" App $args[2..0] }
    Default {
        Write-Host "MateusBMP's Compiler"
        Write-Host "Usage: ./compiler.ps1 [command] [args]"
        Write-Host "Commands:"
        Write-Host "  ./compiler antlr4 [args]: Pass the command to the ANTLR4 tool"
        Write-Host "  ./compiler compile: Compile the generated code"
        Write-Host "  ./compiler run [args]: Run the compiled code"
    }
}
