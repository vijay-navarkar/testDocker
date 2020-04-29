FROM openjdk:8
ADD target/testDocker.jar testDocker.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar" , "testDocker.jar"]
