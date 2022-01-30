FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-encryption-decryption.jar spring-boot-encryption-decryption.jar
ENTRYPOINT ["java","-jar","/spring-boot-encryption-decryption.jar"]
