FROM maven:3.8.2-jdk-8

WORKDIR /smithers-app
COPY . .
RUN mvn clean package

CMD ["java", "-jar", "target/university-schedule-0.0.1-SNAPSHOT.jar"]