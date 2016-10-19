title springboot
@echo off  
set OPTS=-Xms512M -Xmx512M -Xss128k -XX:+AggressiveOpts -XX:+UseParallelGC -XX:NewSize=64M
set LIBPATH=springboot_sample_jar
set ENGINE=bin/springboot-sample.jar
set CP=%ENGINE%

echo ENGINE:%ENGINE%
set MAIN=com.sample.SampleMybatisApplication

set CP=%CP%;%LIBPATH%/*
echo ===============================================================================
echo.  
echo   Engine Startup Environment  
echo   CLASSPATH: %CP%  
echo.  
echo ===============================================================================  
echo.  
java -cp %CP% %MAIN% %OPTS%