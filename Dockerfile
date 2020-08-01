FROM openjdk:latest
COPY build/libs/*.jar /usr/app/
EXPOSE 8000:8000
ENTRYPOINT ["/bin/sh", "-c", "java -jar /usr/app/*.jar"]
