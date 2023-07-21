FROM openjdk:11
EXPOSE 9003
COPY target/test-0.0.1-SNAPSHOT.jar test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/test-0.0.1-SNAPSHOT.jar"]