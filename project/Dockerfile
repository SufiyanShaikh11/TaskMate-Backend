# Use a base Java image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the built jar from your local machine (make sure to build it first)
COPY target/*.jar app.jar

# Expose port 8080 (used by Spring Boot)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
