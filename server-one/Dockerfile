FROM openjdk:11.0.10-slim

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} server-one.jar

ENTRYPOINT ["java", "-jar", "/server-one.jar"]
EXPOSE 8889