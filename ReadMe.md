Grover Web Automation Challenge

**The tests should confirm:**
1. The Top 250 (http://www.imdb.com/chart/top) page returns at least 1 movie, in the list.
2. The previous should be true, for each of the sorting options
3. Assert returned result accordingly
4. Assert each sorting options navigating to the Western genre

**Tools:**
   Java + JUnit/TestNG + Maven/Gradle + Selenium or equivalent


***Framework Architecture***

    Grover_IMDbAutomationTask
    |
    |_idea
    |_src/test/java
    |	|_com
    |       |    |_imdb
    |       |       |_pages
    |	|	   |_BasePage.java
    |	|	   |_TopRatedMoviesPage.java
    |	|	   |_WesterPage.java
    |       |       |_runners
    |	|	   |_CukesRunner.java
    |       |       |_step_definitions
    |	|	   |_Hooks.java
    |	|	   |_Top250StepDef.java
    |	|	   |_WesternStepDefs.java
    |       |       |_utilities
    |	|	   |_BrowserUtils.java
    |	|	   |_ConfigurationReader.java
    |	|	   |_Driver.java
    |   |   |   
    |_src/test/resources
    |	|_features
    |	|	|_top250RatedMovies.feature
    |	|	|_western.feature
    |   |   |
    |   |   |
    |_target
    |_.gitignore
    |_configuration.properties
    |_pom.xml
    |_ReadMe.md


`_Selenium-Cucumber-Java_ `

This repository contains a collection of sample selenium-cucumber-java projects and libraries that demonstrate how to use the tool and develop automation script using the Cucumber BDD framework with Java as programming language. It generates Cucumber HTML Report reporters as well. It also generates screen shots for your failed test cases.

I used different management and automation tools as `IntelliJ`, `Maven` for build management tool where in POM.XML file I store my dependencies and plugins, `Selenium WebDriver` for browser automation, `JUnit` for starting my tests and for assertions and `Cucumber`.
The necessary information such as _**URL**_ and **_Browser_** are inside my **Configuration-Properties** file and I am able to reach this information with the help of **Configuration Reader class**.

This framework is BDD, which uses Cucumber to write tests in `Features Package`, and under Features Package I created _Cucumber feature files_ where I used `GHERKIN` language in order to organize test suites. By using **Gherkin** I am making sure that my test cases are understandable for each member of my team, even for those who aren’t technically strong

I have used **POM** structure in order to keep my codes organized and clean.

**Reporters**

_Screen Shots of the report_

Features
![](../../Desktop/Feature.png)
Tags
![](../../Desktop/Tags.png)
Steps
![](../../Desktop/Steps.png)
Failures
![](../../Desktop/Failures.png)


**URL:** _**https://stackoverflow.com/**_ 

I have used Stack OverFlow  for the challenges which I had. 

**NOTE:**
In order to get the HTML Cucumber report please follow below steps:

    1. Open IDE terminal 
    2. Type mvn verify cmd and  
    3. Hit the Enter
    4. Open target folder 
    5. You will see the report under "Cucumber HTML Reports" directory


