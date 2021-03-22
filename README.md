# Repl


# Maven  

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. https://maven.apache.org/

![Screenshot](imgTest.png)


# api-automation

This is a RESTful API testing Framework using Java, Maven, JUnit, REST Assured 

![Screenshot](Rest.png)
##Apache Maven
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. https://maven.apache.org/

## JUnit  


JUnit is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks. https://junit.org/junit4/

### Routes Tested

The following HTTP method is tested:
•	GET


# REST Assured
Rest-Assured is a Java-based library that is used to test RESTful Web Services. This library behaves like a headless Client to access REST web services. We can create highly customize-able HTTP Requests to send to the Restful server.http://rest-assured.io/


### Integrated Development Environment
Eclipse IDE is used to develop this framework
•	Open file in Eclipse:..\api-automation\src\test\java\com.vutility.API.HardCodedOrgs
•	Right click=>Run As
•	Junit Test



### Configuration on pom.xml
•	Go to project in Eclipse: api-automation 
•	Open pom.xml file
•	Add the following dependency:



### Run Tests with pom.xml
•	Go to project in Eclipse: api-automation 
•	Open pom.xml file
•	Right click=>Run As=>Maven clean
•	Confirm BUILD SUCCESS
•	Go back to pom.xml
•	Right click=>Run As=>Maven Test
•	Confirm BUILD SUCCESS and Test Running

### Run Tests with Command Prompt
•	Install Maven with Homebrew (Easier)
o	$ brew install maven
o	$ mvn clean
o	$ mvn test

