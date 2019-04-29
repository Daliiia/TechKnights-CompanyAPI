# TechKnights-CompanyAPI
this is an api for company information (JAVA,Springboot)
-
to use this api:
For Company API:
1-	Clone Project folders from Github
2-	Use Eclipse or intellij IDE
3-	Make sure u are using JDK 8 version in your computer, if not then download it 
4-	Open project via chosen IDE (intellij recommended)
5-	Wait for dependencies files to be installed (press “import changes” in bottom right screen in IDE) .
* if you want to make an new project an failed to import make a "Maven Project"
________________________________________________________________________________________________________________________________________
NOTE:
- you have to make sure that no other processes use port number 8080
- open your command line in PC 
- run “findstr 8080” command
- if the response was empty then no processes use this port 
- if any , use “taskkill /F /PID” and the process id which is shown to u in your terminal.
________________________________________________________________________________________________________________________________________

6-	Run project as follows:
-	Open DemoApplication file and Click right on it. 
-	Choose “run DemoApplication”.

7-	After Running the project go to Postman to Make your requests 
________________________________________________________________________________________________________________________________________

To insert company >> use POST Request with
-
URL: http//127.0.0.1:8080/company/signup
-
Put your parameters in parameter section of Postman
parameters:
Name,
password,
description,
address,
jobs.
Response : whole body info of the company 
________________________________________________________________________________________________________________________________________
To update company >> use PUT request with
-
URL: http//127.0.0.1:8080/company/update
-
parameters:
Name
password,
description,
address,
jobs.

Response : whole updated body info of the company 
________________________________________________________________________________________________________________________________________
To delete company >> DELETE Request
-
URL: http//127.0.0.1:8080/company/deleteaccount
-
parameters:
Name

Response: account deleted successfully 
________________________________________________________________________________________________________________________________________
To login USE >> GET request
-
URL: http//127.0.0.1:8080/company/login
-
parameters:
Name
password 

Response : whole updated body info of the company 
________________________________________________________________________________________________________________________________________
To Fill form as an applicant USE >> PUT request
-
URL: http//127.0.0.1:8080/form/fillform
-
parameters:
nameAns,
phoneAns,
emailAns,
educationAns,
fieldAns,
skillsAns,
whyAns,
name (Company name)

Response: the whole body of the form with questions and answers 
________________________________________________________________________________________________________________________________________
