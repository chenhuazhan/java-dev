@echo off
echo �������ɣ����Ե�......
%JAVA_HOME%\bin\keytool  -genkey -alias chz -keyalg RSA -keystore chz.keystore
echo ֤��keystore�Ѿ�����
echo. & pause