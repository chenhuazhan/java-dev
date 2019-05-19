@echo off
echo 正在生成，请稍等......
%JAVA_HOME%\bin\keytool  -genkey -alias ccc -keyalg RSA -keystore ccc.keystore
echo 证书keystore已经生成
echo. & pause