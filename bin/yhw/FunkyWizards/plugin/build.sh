#!/bin/bash

rm dist/plugins/YOUR_PROJECT_NAME_HERE.jar > /dev/null

cd bin/ > /dev/null
zip -r -u ../dist/plugins/YOUR_PROJECT_NAME_HERE.jar * > /dev/null

screen -S "eclipse-bukkit-debugger" -p 0 -X stuff "`printf "reload\r"`" > /dev/null
