
# Kafka Spring Boot Demo

A complete implementation of Kafka with Spring Boot, Docker, Java 17, and Maven featuring a producer and consumer application.

## Features

- Kafka Producer application with REST API
- Kafka Consumer application that processes messages
- Dockerized Kafka and Zookeeper setup
- JSON message serialization
- Spring Boot 3.1 with Java 17
- Maven build system

## Prerequisites

- Java 17 JDK
- Docker and Docker Compose
- Maven 3.8+
- (Optional) Postman or curl for API testing

## Technologies

- **Backend**: Spring Boot 3.1
- **Message Broker**: Apache Kafka 3.4.0
- **Containerization**: Docker
- **Build Tool**: Maven
- **Java Version**: 17

## Getting Started

### Running with Docker

1. Start Kafka and Zookeeper:
   ```bash
   docker-compose up -d
   ```

2. Verify containers are running:
   ```bash
   docker ps
   ```

### Running the Applications

1. **Build and run the producer**:
   ```bash
   cd producer
   mvn clean install
   mvn spring-boot:run
   ```

2. **Build and run the consumer in a separate terminal**:
   ```bash
   cd consumer
   mvn clean install
   mvn spring-boot:run
   ```

Snapshots - 

![image](https://github.com/user-attachments/assets/32ba26f5-7543-468e-961c-3827ef04127f)

![image](https://github.com/user-attachments/assets/ae5ae321-fe8a-46dc-9d72-5c759d78dc02)

![image](https://github.com/user-attachments/assets/adc60410-10eb-4192-9f7b-7059adb63c13)


