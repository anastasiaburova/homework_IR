
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN ./mvnw clean package -DskipTests

COPY target/your-artifact-name.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080
