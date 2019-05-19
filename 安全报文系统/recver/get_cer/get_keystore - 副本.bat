@echo off
echo 正在生成，请稍等......
%JAVA_HOME%\bin\keytool  -genkey -alias XSJ -keyalg RSA -keystore XSJ.keystore
echo 证书keystore已经生成
echo. & pause