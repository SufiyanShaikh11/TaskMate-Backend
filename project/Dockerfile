# Use official OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the jar file (make sure the jar is already built using `mvnw package -DskipTests`)
COPY target/project-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on (default Spring Boot port is 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar" ]
