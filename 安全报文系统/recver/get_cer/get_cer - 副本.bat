@echo off
echo 正在导出证书，请稍等......
%JAVA_HOME%\bin\keytool  -export -alias XSJ -keystore XSJ.keystore -file XSJ.cer 

echo. & pause