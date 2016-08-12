#!/bin/bash

unset JAVA_HOME
echo "export JAVA_HOME=/usr/lib/jvm/default-java" >> ~/.bashrc

echo "alias tomcat-start='sh /usr/local/tomcat/bin/startup.sh'" >> ~/.bash_aliases
echo "alias tomcat-stop='sh /usr/local/tomcat/bin/shutdown.sh'" >> ~/.bash_aliases