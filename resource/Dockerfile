FROM gradle:7.1.1-jdk16 AS build

WORKDIR /usr/app

COPY ./ ./

RUN ["./gradlew", "build"]

#  #  Only usable on ARM64
#  Cannot build correctly on M1 mac whatsoever
FROM openjdk:16-ea-alpine
#  FROM gcr.io/distroless/java

COPY --from=build /usr/app/build/libs/*.jar ./app.jar

CMD ["java", "-jar", "./app.jar"]

EXPOSE 8080
