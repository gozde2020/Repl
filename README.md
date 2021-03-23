# Repl

# api-automation

This is a RESTful API testing Framework using Java, Maven, JUnit, REST Assured 

![Screenshot](Rest.png)

## Maven
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. https://maven.apache.org/


## JUnit  
JUnit is a simple framework to write repeatable tests. It is an instance of the xUnit architecture for unit testing frameworks. https://junit.org/junit4/


## REST Assured
Rest-Assured is a Java-based library that is used to test RESTful Web Services. This library behaves like a headless Client to access REST web services. We can create highly customize-able HTTP Requests to send to the Restful server.http://rest-assured.io/

### Routes Tested
The following HTTP method is tested:
-	GET

### Integrated Development Environment
Eclipse IDE is used to develop this framework
-	Open file in Eclipse:..\api-automation\src\test\java\com.vutility.API.HardCodedOrgs
-	Right click=>Run As
-	Junit Test

### Configuration on pom.xml
-	Go to project in Eclipse: api-automation 
-	Open pom.xml file
-	Add the following dependency:
> <build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M5</version>
				<configuration>
					<includes>
						<!-- <include>**/*APIRunner.java</include> -->
					</includes>
					<testFailureIgnore>true</testFailureIgnore>
				</configuration>
			</plugin>
     	</plugins>
   </build>


### Run Tests with pom.xml
-	Go to project in Eclipse: api-automation 
-	Open pom.xml file
-	Right click=> Run As=> Maven clean
-	Confirm BUILD SUCCESS
-	Go back to pom.xml
-	Right click=> Run As=> Maven Test
-	Confirm Test Running and BUILD SUCCESS

### Run Tests with Command Prompt
1. Install Maven with Homebrew
   - Open terminal
   - Run _brew install maven_ command
   - Confirm installed maven by running _mvn -v_ command
2. Change your directory to api-automation project and run the following commands;
```
mvn clean
mvn test
```

