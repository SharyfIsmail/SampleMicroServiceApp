FROM openjdk:11.0.10-slim

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} server-two.jar

ENTRYPOINT ["java", "-jar", "/server-two.jar"]
EXPOSE 8890