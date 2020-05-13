FROM openjdk:8-jdk-alpine as builder
RUN mkdir -p /workspace

WORKDIR /workspace
COPY build.gradle settings.gradle gradlew /workspace/
COPY gradle /workspace/gradle
RUN ./gradlew build || return 0 
COPY . /workspace
COPY . .
# RUN ./gradlew build  <- should be this instead but the test will fail due to postrgres not running (no arguments passed, no mock provided)
RUN ./gradlew bootJar

FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash
RUN mkdir -p /app

COPY --from=builder /workspace/build/libs/app.jar /app
COPY startup.sh /app
WORKDIR /app

CMD [ "./startup.sh"]

EXPOSE 8080