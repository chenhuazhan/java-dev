@echo off
echo ���ڵ���֤�飬���Ե�......
%JAVA_HOME%\bin\keytool  -export -alias chz -keystore chz.keystore -file chz.cer 

echo. & pause