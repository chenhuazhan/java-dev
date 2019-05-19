@echo off
echo 正在生成，请稍等......
%JAVA_HOME%\bin\keytool  -certreq -alias ccc -file ccc.csr -keystore ccc.keystore
echo 证书请求CSR已经生成
echo. & pause