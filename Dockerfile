FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/primes-service-0.0.1-SNAPSHOT.jar primes-service.jar
ENTRYPOINT ["java", "-jar", "primes-service.jar"]
