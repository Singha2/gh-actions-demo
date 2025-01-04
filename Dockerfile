FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY build/libs/*.jar app.jar

# Accept Spring profile as build argument
ARG SPRING_PROFILE=prod

ENV SPRING_PROFILES_ACTIVE=${SPRING_PROFILE}

EXPOSE 8080

ENTRYPOINT ["java", \
            "-jar", \
            "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", \
            "app.jar"]