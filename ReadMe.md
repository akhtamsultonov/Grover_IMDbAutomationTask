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


**ABOUT Framework**

**Tools :** `Java-JUnit-Maven-BDD-Cucumber-Selenium-Gherkin`

I used different management and automation tools as `IntelliJ`, `Maven` for build management tool where in POM.XML file I store my dependencies and plugins, `Selenium WebDriver` for browser automation, `JUnit` for starting my tests and for assertions and `Cucumber`.
The necessary information such as _**URL**_ and **_Browser_** are inside my **Configuration-Properties** file and I am able to reach this information with the help of **Configuration Reader class**.

This framework is BDD, which uses Cucumber to write tests in `Features Package`, and under Features Package I created _Cucumber feature files_ where I used `GHERKIN` language in order to organize test suites. By using **Gherkin** I am making sure that my test cases are understandable for each member of my team, even for those who aren’t technically strong

I have used **POM** structure in order to keep my codes organized and clean. I created separate Java classes for each page of my application where I store all the Web Elements of that page as well as related methods. For instance: I have a Base Page which is an **Abstract Class** that can be extended by other classes and use its reusable codes or methods.

In addition, I have Runners Package and under this package I created a _Cukes-Runner_ class that runs my tests and helps to generate codes for step definition from my feature files.
it contains plugin to generate HTML reports with the exact steps from the feature file. Reporting is done in cucumber with Cucumber HTML report

I have another created Step-Definitions Package. Under this package, I created separate classes where my methods execute feature files and keep implemented Step-Definitions. Besides these classes, I have a Hooks class that implements my codes which runs before and after all my tests, this is where Take-Screen-Shot for each failure.


Lastly, I have another separate package which is Utilities Package. Under this package I have different classes such as Driver class which is designed with Singleton Design Pattern, Browser-Utilities and Configuration Reader classes.


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

I have used **Stack OverFlow**  for the challenges which I had. 

**NOTE:**
In order to get the HTML Cucumber report please follow below steps:

    1. Open IDE terminal 
    2. Type mvn verify cmd and  
    3. Hit the Enter
    4. Open target folder 
    5. You will see the report under "Cucumber HTML Reports" directory


