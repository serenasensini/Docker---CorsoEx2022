FROM tomcat:9.0.58-jre8-openjdk-slim-buster

LABEL maintainer="test@mail.com"

ADD ./target/REST-API-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]