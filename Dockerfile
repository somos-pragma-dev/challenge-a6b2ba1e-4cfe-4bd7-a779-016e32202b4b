FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY..
RUN./gradlew build

FROM openjdk:21-jdk-slim AS runtime
WORKDIR /app
COPY --from=build /app/build/libs/ecommerce-0.0.1-SNAPSHOT.jar ecommerce.jar
ENTRYPOINT ["java", "-jar", "ecommerce.jar"]