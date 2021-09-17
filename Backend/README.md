VaccinationRecordSystem | Backend

it is recommended to use the software Postman or a browser to test each request.

CHARACTERISTICS
- Language: Java version 11
- Framework: Spring Boot 2.5.4

INDICATIONS
- The first time you have to uncomment the last three lines of the file application.properties of the source VaccinationSystem/src/main/resources/
  After the first running, comment the last three lines of the file
- There are two roles with different views each one: 
						a)Admin 
						b)Employee
- There are two databases: a)main_record: it is only modifiable by admin and it storage: 
											- Personal Identifier
						      					- Name
						      					- Surname
						      					- Email
					    	      					- Role
						      					- Password
			   b)secondary_record: it is modifiable by each user/employee and it storage:
											- Born date
											- Home address
											- Phone
											- Vaccination state
											- Vaccination date
											- Vaccination type
											- Dosage


