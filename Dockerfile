#FROM ubuntu:latest
#LABEL authors="K02535"
#
#ENTRYPOINT ["top", "-b"]
# Stage 1: Build the application using Gradle
FROM gradle:8.10-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

# Stage 2: Create the runtime image with only the JAR file
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]