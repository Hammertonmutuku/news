# OrganisationAPI
The project below is an organisationAPI that basically creates them by getting the relevant input and enabling the view of the input.


## Technologies used
- Java 11
- sql2o
- JUnit 5
- Gradle build tools

## Installation
###Requirements for running the application locally:
-Ensure that you have the following.
1.The relevant IDE.i.e Intellij.
2. Have postman installed.
3. Have postgres installed.

###running the application locally
1. Clone or download the repo @ https://github.com/Hammertonmutuku/news.
2. Navigate to the cloned directory from your local host.
3. Execute command - gradle build - to fetch all the required dependencies.
4. Navigate to `src/main/java/App.java` file.
5. Edit `mysql` variable url and insert in `{}` your : `"jdbc:postgresql://localhost:3306/{database name}", "{user}", "{password}"`
6. Execute command - gradle run - to launch the project.
7. Navigate to - http://localhost:4567 - in your browser.
