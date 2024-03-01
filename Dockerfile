FROM maven:latest

WORKDIR /app

COPY pom.xml /app/

RUN mvn package



CMD ["java", "-jar", "target/interconversions.jar"]