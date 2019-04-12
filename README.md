### Java Spring Boot RESTful API Practice Project

A Java Spring Boot application that supports a RESTful API. 

When given an age (e.g., 45) the service will pull person records for people aged 45 years; when given a name (e.g., Deepak) the service will pull a person record.  

##### Person model

    Person
        Name
        Dob
        Address
        Height
        Weight
        Age

The application employs an in-memory H2 database and the API can be tested using [Postman](https://www.getpostman.com/).

To run:

``$ mvn spring-boot:run``

##### Endpoints
###### GET Person by personId
    /person/id/{personId}
    
###### GET Person by personName
    /person/name/{personName}
    
###### GET Person by personAge
    /person/age/{personAge}
    
###### GET Person List
    /persons
    
###### POST / add Person
    /person/add
    
 ###### PUT / update Person by personId
    /person/update/{personId}

    




 