# 🧱 STAGE 1: Build the JAR
FROM maven:3.9.4-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# 🏃 STAGE 2: Run the JAR
FROM openjdk:17-jdk-slim
COPY --from=builder /app/target/dockerexample-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
