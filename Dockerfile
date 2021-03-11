FROM openjdk:8
COPY ./target/calculator-scientific-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-scientific-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]