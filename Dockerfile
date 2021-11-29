FROM openjdk:8
EXPOSE 8080
ADD target/employee-web-service.jar employee-web-service.jar
ENTRYPOINT ["java","-jar","/employee-web-service.jar"]
