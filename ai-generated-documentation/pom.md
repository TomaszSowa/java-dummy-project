##  pom.xml Build Script Documentation

**1. Overview:**

This `pom.xml` file defines a project configuration for the "dummy-java-project" using Maven, a build automation tool for Java projects. It specifies project metadata (groupId, artifactId, version), dependencies required by the project, and plugins used during the build process.  The primary focus of this script is setting up a testing environment with JUnit Jupiter and Mockito for unit testing.

**2. Build Tool:** Maven

**3. Script/File Name:** pom.xml

**4. Detailed Documentation:**

   - **Project Metadata:**
     - **Description:** Defines basic information about the project, including its group ID (org.example), artifact ID (dummy-java-project), and version (1.0-SNAPSHOT).
     - **Parameters:** 
       - `groupId`: Unique identifier for the project's organization.
       - `artifactId`:  Unique identifier for the project within its organization.
       - `version`: Current version of the project.

   - **Properties:**
     - **Description:** Defines properties used throughout the build configuration.
     - **Parameters:** 
       - `maven.compiler.source`: Specifies the Java source code version (17 in this case).
       - `maven.compiler.target`: Specifies the Java target bytecode version (17).
       - `project.build.sourceEncoding`: Sets the character encoding for source files (UTF-8).
       - `junit.jupiter.version`: Defines the version of JUnit Jupiter to be used (5.10.0).

   - **Dependencies:**
     - **Description:** Lists external libraries required by the project. 
     - **Parameters:** 
       - `groupId`, `artifactId`, `version`, `scope`: Define each dependency's information.
       - `scope`: Specifies the dependency's usage (e.g., "test" for testing dependencies).

   - **Plugins:**
     - **Description:** Defines plugins used to extend Maven's functionality during the build process.
     - **Parameters:** 
       - `groupId`, `artifactId`, `version`: Define each plugin's information.


**5. Language Version:** Java 17 (specified by `maven.compiler.source` and `maven.compiler.target`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

1. **Load Project Configuration:** Read the `pom.xml` file and parse its contents into a data structure representing the project's metadata, dependencies, and plugins.
2. **Set Up Environment:** Configure the build environment based on the specified Java version (17) and other properties defined in the `pom.xml`.
3. **Resolve Dependencies:** Download and install all required dependencies listed in the `dependencies` section of the `pom.xml`. 
4. **Compile Source Code:** Compile the project's source code using the configured Java compiler settings (version 17).
5. **Execute Tests:** Utilize the Maven Surefire plugin to execute unit tests defined within the project. The plugin will use JUnit Jupiter and Mockito for testing purposes.
6. **Generate Reports:** Generate build reports, including test results, based on the execution of the tests.

**8. Dependencies and Plugins Equivalents:**

- **Maven:** Gradle (similar functionality)


