# Use the official OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR from the Gradle build
COPY build/libs/newcustomer-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

COPY customer-crud-app-447113-7758cdd359e7.json /app/keyfile.json
ENV GOOGLE_APPLICATION_CREDENTIALS="/app/keyfile.json"

