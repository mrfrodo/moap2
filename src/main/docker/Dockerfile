FROM openjdk:8

ADD target/ moap-0.0.1-SNAPSHOT.jar docker-app.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "docker-app.jar"]