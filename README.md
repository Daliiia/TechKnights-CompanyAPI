# TechKnights-CompanyAPI
this is an api for company information (JAVA,Springboot)
to use this api:
For Company API:
1-	Clone Project folders from Github
2-	Use Eclipse or intellij IDE
3-	Make sure u are using JDK 8 version in your computer, if not then download it 
4-	Open project via chosen IDE (intellij recommended)
5-	Wait for dependencies files to be installed (press “import changes” in bottom right screen in IDE) .
NOTE:
- you have to make sure that no other processes use port number 8080
- open your command line in PC 
- run “findstr 8080” command
- if the response was empty then no processes use this port 
- if any , use “taskkill /F /PID” and the process id which is shown to u in your terminal.

6-	Run project as follows:
-	Open DemoApplication file and Click right on it. 
-	Choose “run DemoApplication”.

7-	After Running the project go to Postman to Make your requests 

To insert company >> use POST Request with
URL: https//127.0.0.1:8080/company/signup
Put your parameters in parameter section of Postman
parameters:
c_Name,
password,
description,
address,
jobs.
To update company >> use PUT request with
URL: https//127.0.0.1:8080/company/update
parameters:
c_Name
To delete company >> DELETE Request
URL: https//127.0.0.1:8080/company/deleteaccount
parameters:
c_Name
To login USE >> GET request
URL: https//127.0.0.1:8080/company/login
parameters:
c_Name
password 
