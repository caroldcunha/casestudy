#!/bin/bash
svnUser=%1
svnPasswd=%2
warFile='webapp.war'

#Script to be called with command lines as 1- SVN UserName 2- SVN Users password

#Sync with SVN repo
svn co --username $svnUser --password $svnPasswd --no-auth-cache --non-interactive --trust-server-cert  https://svn.persistent.co.in/svn/DevOps_Compt/$svnUser/ .

#Determine if the WAR file is pre-existing in the SVN repo.  If the file pre-existed in repo following command would return M
svn status | awk '$2 == "webapp.war" {print $1}'

fileStatus=`svn status | awk '$2 == "readme.txt" {print $1}'`

if [ $fileStatus != 'M' ] then
	svn add --username $svnUser --password $svnPasswd --no-auth-cache --non-interactive --trust-server-cert warFile #Add the new file to SVN
else
        svn update --username $svnUser --password $svnPasswd --no-auth-cache --non-interactive --trust-server-cert #Update the existing file to SVN
fi

svn commit --username $svnUser --password $svnPasswd --no-auth-cache --non-interactive --trust-server-cert -m "Ready for TEST" #Commit the file to SVN

#Run the Web Server container in TEST environment
sudo docker  run -td -p 8022:22 -p 8088:8080  --name websrvTEST sumedh1988/ubuntussh:1404

#Retrive the server IP address
webIP=`sudo docker inspect websrvTEST | grep -w "IPAddress" | head -1 | grep -E -o '(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)'`


#Run the database server container in TEST environment
sudo docker  run -td -p 8022:22 -p 8306:3306  --name websrvTEST sumedh1988/ubuntussh:1404

#Retrive the server IP address
dbIP=`sudo docker inspect websrvTEST | grep -w "IPAddress" | head -1 | grep -E -o '(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)'`


#Run Ansible Playbook for WEB Server host to Install Tomact
#TODO HERE - Use the IP address obtained above (webIP)

#Run Ansible Playbook for WEB Server host to Install MySQL (this playbook should also enable remote login for the user)
#TODO HERE - Use the IP address obtained above (dbIP)


#Run knife bootstrap command to bootstrap the websrvTEST server as a node
#TODO - knife bootstrap -u root -p pass $webIP -N websrvTEST -runlist 'recipe:deploywar'

#Run knife ssh command to execute chef-client command on WebSrvTEST
#TODO  - knife ssh -u root -p pass $webIP <.......>












