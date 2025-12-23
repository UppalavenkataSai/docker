# Stage 1: Build with Maven
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the Spring Boot app
RUN mvn clean package -DskipTests

# Stage 2: Run with JDK 17
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the fat JAR from build stage
COPY --from=build /app/target/demo-0.0.1.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
