FROM  openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} client-rest-service.jar
ENTRYPOINT ["java","-Dserver.servlet.context-path=/client-rest-service","-Dspring.profiles.active=dev","-jar","/client-rest-service.jar"]