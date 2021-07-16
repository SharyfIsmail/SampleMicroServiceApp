FROM openjdk:11.0.10-slim

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} eureka-server.jar

ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]
EXPOSE 8761