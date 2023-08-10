@echo off
setlocal

set "targetDirectory=C:\Users\iaman\Documents\CERTIFICATE"
set "cutoffDate=%date:~10,4%-%date:~4,2%-%date:~1,2%"

for /f "delims=" %%A in ('dir "%targetDirectory%\*.*" /s /a-d /tc ^| findstr /v "%cutoffDate%"') do (
    echo [FILE] "%%~fA"
)

for /f "delims=" %%B in ('dir "%targetDirectory%\*.*" /s /a:d /tc ^| findstr /v "%cutoffDate%"') do (
    echo [FOLDER] "%%~fB"
)

endlocal





