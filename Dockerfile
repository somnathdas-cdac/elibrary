# Use a lightweight OpenJDK 17 runtime base
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Create a logs folder inside the container
RUN mkdir logs

# Copy the compiled Maven artifact from your target folder
COPY target/*.jar app.jar

# Expose internal container port (Matching your application port)
EXPOSE 8087

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
