@echo off
echo ���ڵ���֤�飬���Ե�......
%JAVA_HOME%\bin\keytool  -export -alias XSJ -keystore XSJ.keystore -file XSJ.cer 

echo. & pause