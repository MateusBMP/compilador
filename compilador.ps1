param([string]$command="help")

$command = $command.ToLower()

switch ($command) {
    "package" { mvn package }
    "run" { java -cp .\target\compilador-1.0-SNAPSHOT.jar com.arcproject.compilador.App }
    Default {
        Write-Host "Usage: compilador.ps1 [command]"
        Write-Host "Commands:"
        Write-Host "  help: Print this help"
        Write-Host "  package: take the compiled code and package it in its distributable format, such as a JAR"
        Write-Host "  run: Run the compiled code"
    }
}
