FROM openjdk:11
ADD build/libs/ktest-0.0.1-SNAPSHOT.jar ktest-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "ktest-0.0.1-SNAPSHOT.jar"]