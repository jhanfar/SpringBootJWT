FROM openjdk:11
ADD ./target/crud-0.0.1-SNAPSHOT.jar crud-0.0.1-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT [ "java", "-jar", "crud-0.0.1-SNAPSHOT.jar" ]