FROM tomcat:8-jre8
MAINTAINER Luke Petzer <lukepetzerint2@gmail.com>
EXPOSE 8080
EXPOSE 8090
ARG WAR_FILE
COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.war
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom","-jar", "/usr/local/tomcat/webapps/app.war" ]
