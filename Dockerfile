FROM openjdk:17
COPY ./build/libs/WeserBot-0.2.3.jar WeserBot.jar
COPY /data /data
ENTRYPOINT ["java", "-jar", "WeserBot.jar"]