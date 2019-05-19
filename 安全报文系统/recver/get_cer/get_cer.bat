@echo off
echo 正在导出证书，请稍等......
%JAVA_HOME%\bin\keytool  -export -alias ccc -keystore ccc.keystore -file ccc.cer 

echo. & pause