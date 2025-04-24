# Byte-By-Bytes-Chatbot

# Requirements

Java 21 or newer

Maven 3.6.3 or newer

Spring Boot 3.3.4 or newer

Spring AI 1.0.0-M2 or newer     // I used Spring AI 1.0.0-M7


# How to get started

1. Set up your OpenAI key.    //In order to recieve a reponse, You have to purchase tokens
                             from openAI platform

2. If necessary build the project using the command:  mvn clean install      


3. Command to run the application:   mvn spring-boot:run

4. After you run the program, enter http://localhost:8080 in your browser to access the basic non-streaming chatbot.

5. To access the streaming chatbot, enter http://localhost:8080/stream in your browser. 
