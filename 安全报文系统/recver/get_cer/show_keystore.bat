@echo off
echo 证书库中的所有证书:
%JAVA_HOME%\bin\keytool  -list -keystore ccc.keystore 

echo. & pause