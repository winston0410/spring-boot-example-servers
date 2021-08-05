FROM scratch AS build

WORKDIR /usr/app

COPY ./ ./

RUN ["./gradlew", "build"]

FROM openjdk:16-ea-alpine

COPY --from=build /build/libs/resource-0.0.1-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "./app.jar"]

EXPOSE 8080
