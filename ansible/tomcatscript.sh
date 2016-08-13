#!/bin/bash

str1=`cat ~/.bashrc | grep '^export JAVA_HOME'`
str2=`cat ~/.bashrc | grep '^export CATALINA_HOME'`

if [ -z "$str1" ]
then
   echo "export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64" >> ~/.bashrc
fi
if [ -z "$str2" ]
then
   echo "export CATALINA_HOME=/opt/apache-tomcat-6.0.32" >> ~/.bashrc
fi
