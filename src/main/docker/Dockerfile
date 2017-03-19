#FROM frolvlad/alpine-oraclejdk8:slim
#FROM java:openjdk-9
FROM java:openjdk-8-alpine
VOLUME /tmp
ADD boot-kotlin-app-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]