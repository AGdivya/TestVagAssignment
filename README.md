# TestVagAssignment
Getting Started

Step 1 : Creating and importing a Maven Project
:- Import this project in Eclipse.

Step 3 : Maven Project structure
* Pom.xml - It has all dependecies required in project. 
            Used Gson Pugin to convert Java Object into Json or vice versa.
            Used TestNg plugin for verification and validation.
* JsonMapper.java - This class helps in converting JSON to Java object.
* Model - Created 2 java POJO classes - Team.java and Player.java
* TeamDetails.java - This class contains all the business logic for the test.
* TeamCombinationsTest.java - This class contains all the test cases to be executed.

Step 5 : How to build this project
mvn clean 
mvn build
mvn test- To run our test
