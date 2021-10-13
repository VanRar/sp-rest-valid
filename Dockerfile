# выбираем версию
FROM adoptopenjdk/openjdk8
# и порт
EXPOSE 8080

# указываем где будет расположен наш джарник, в pom прописываем что сохраняем в jar
ADD target/sp-rest-valid-0.0.1-SNAPSHOT.jar spring_boot.jar

# указываем список команд для докера
ENTRYPOINT ["java", "-jar", "/spring_boot.jar"]
