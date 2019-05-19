@echo off
echo 正在生成，请稍等......
%JAVA_HOME%\bin\keytool  -certreq -alias chz -file chz.csr -keystore chz.keystore
echo 证书请求CSR已经生成
echo. & pause