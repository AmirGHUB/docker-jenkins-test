FROM openjdk:jdk-alpine

COPY target/take1-0.0.1-SNAPSHOT.jar /deployments/

CMD java -jar /deployments/take1-0.0.1-SNAPSHOT.jar