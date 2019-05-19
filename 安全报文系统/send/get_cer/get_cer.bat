@echo off
echo 正在导出证书，请稍等......
%JAVA_HOME%\bin\keytool  -export -alias chz -keystore chz.keystore -file chz.cer 

echo. & pause