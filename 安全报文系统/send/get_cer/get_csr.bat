@echo off
echo �������ɣ����Ե�......
%JAVA_HOME%\bin\keytool  -certreq -alias chz -file chz.csr -keystore chz.keystore
echo ֤������CSR�Ѿ�����
echo. & pause