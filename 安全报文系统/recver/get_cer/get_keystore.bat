@echo off
echo �������ɣ����Ե�......
%JAVA_HOME%\bin\keytool  -genkey -alias ccc -keyalg RSA -keystore ccc.keystore
echo ֤��keystore�Ѿ�����
echo. & pause