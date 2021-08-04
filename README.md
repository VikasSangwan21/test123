# lg-functional-ui-test
Cucumber IO, Gherkin, Selenium WebDriver, Maven, TestNG, JVM Cucumber Report, GitLab and Java

# Pre Condition
1. Install Java JDK+JRE. Java home path for windows only
2. Install IDE such as Eclipse or IntelliJ
3. Ensure you have maven configured

# RUN THE TEST
1. Clone the project
2. mvn verify -Denv=prod -Dbrowser=ch -Dcucumber.filter.tags="@smoke"