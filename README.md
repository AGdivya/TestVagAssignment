# TestVagAssignment
Getting Started

Pre-requisites - Java & Eclipse - https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3


Step 1 : Creating and importing a Maven Project
Import this project in Eclipse.

Step 2 : Understanding Project Object Model -
Pom.xml - It has all dependecies required in project
Used Gson Pugin to convert Java Object into Json or vice versa.
Used TestNg plugin for verification and validation.

Step 3 : Maven Build Life Cycle
run "mvn clean install"
Build LifeCycle - Validate, Compile, Test, Package, Integration Test, Verify, Install, Deploy
Convention over Configuration - Pre defined folder structure
Source Code
${basedir}/src/main/java
${basedir}/src/main/resources
Test Code
${basedir}/src/test

Step 4 : How does Maven Work?
Local Repository
Maven repository
mvn install - copies the created jar to local maven repository - a temp folder on my machine where maven stores the files.

Step 5 : How to build this project
mvn clean 
mvn build
mvn test- To run our test
