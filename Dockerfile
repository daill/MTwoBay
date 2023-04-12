FROM openjdk:17
COPY ./build/libs/MTwoBay-0.0.1.jar MTwoBay.jar
COPY /data /data
ENTRYPOINT ["java", "-jar", "MTwoBay.jar"]