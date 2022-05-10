FROM openjdk:8
ADD target/SpringBootCrud-0.0.1-SNAPSHOT.jar SpringBootCrud-0.0.1-SNAPSHOT.jar
ADD src/main/resources/application.properties application.properties
ENTRYPOINT ["java", "-jar", "/SpringBootCrud-0.0.1-SNAPSHOT.jar", "-Dspring.config.location=application.properties"]