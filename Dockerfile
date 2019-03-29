FROM adoptopenjdk/openjdk11:jdk-11.0.2.9

ENV LANG C.UTF-8
COPY target/kuji-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]