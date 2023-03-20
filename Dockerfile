FROM eclipse-temurin:11-alpine
RUN mkdir -p /application
COPY ./target/app.jar /application/app.jar
# This is the port that your javalin application will listen on
EXPOSE 7000 
ENTRYPOINT ["java", "-jar", "/application/app.jar"]
