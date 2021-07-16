FROM openjdk:11.0.10-slim

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} cloud-server.jar

ENTRYPOINT ["java", "-jar", "/cloud-server.jar"]
EXPOSE 8111
