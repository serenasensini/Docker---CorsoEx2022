# Dockerfile for Apache HTTP Server
FROM ubuntu:18.04
# Install apache2 package
RUN apt-get update && apt-get install -y apache2
# Other instructions
ENV APACHE_LOG_DIR /var/log/apache2
VOLUME /var/www/html
EXPOSE 80
# Launch apache2 server in the foreground
ENTRYPOINT ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
