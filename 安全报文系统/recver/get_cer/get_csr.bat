@echo off
echo �������ɣ����Ե�......
%JAVA_HOME%\bin\keytool  -certreq -alias ccc -file ccc.csr -keystore ccc.keystore
echo ֤������CSR�Ѿ�����
echo. & pause