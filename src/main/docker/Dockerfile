FROM openjdk:alpine
VOLUME /tmp
ADD maven/aos-config-service-${artifactVersion}.jar app.jar
ENV JAVA_OPTS=""
ENV CONFIG_SERVER_PORT="9000"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
