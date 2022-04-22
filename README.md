# maven-dependency-demo

This is a demo that shows how you can find direct and transitive dependencies in your Maven projects with the `mvn` command.

**Note:** This project requires Java 8 or higher.

To build:

```
mvn clean compile
```

To list all dependencies:

```
mvn dependency:tree
```

To find a specific dependency:

```
mvn dependency:tree -Dincludes=org.apache.logging.log4j:log4j-api
```
