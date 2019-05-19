@echo off
echo 正在编译，请稍等......
%JAVA_HOME%\bin\javac  sender.java -classpath bcprov-jdk14-136.jar
echo 编译完成
echo. & pause