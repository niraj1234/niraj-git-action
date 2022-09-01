FROM openjdk:8
EXPOSE 8080
ADD target/github-action-repo-springboot.jar github-action-repo-springboot.jar
ENTRYPOINT ["java" , "-jar" , "github-action-repo-springboot.jar"]
