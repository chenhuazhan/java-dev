@echo off
echo �������ɣ����Ե�......
%JAVA_HOME%\bin\keytool  -genkey -alias XSJ -keyalg RSA -keystore XSJ.keystore
echo ֤��keystore�Ѿ�����
echo. & pause