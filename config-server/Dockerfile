FROM openjdk:11.0.10-slim

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} config-server.jar

ENTRYPOINT ["java", "-jar", "/config-server.jar"]
EXPOSE 8888
