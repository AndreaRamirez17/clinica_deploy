FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/clinica-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_clinica.jar
ENTRYPOINT ["java", "-jar", "app_clinica.jar"]