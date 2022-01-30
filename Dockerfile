FROM openjdk:8
EXPOSE 8080
ADD target/spring-data-jpa-encryption-0.0.1-SNAPSHOT.jar spring-data-jpa-encryption-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-data-jpa-encryption-0.0.1-SNAPSHOT.jar"]
