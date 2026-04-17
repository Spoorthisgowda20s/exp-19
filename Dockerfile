FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . /app

Run javac Grade.java

CMD ["java", "Grade"]