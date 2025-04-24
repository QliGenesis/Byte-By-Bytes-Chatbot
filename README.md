# Byte-By-Bytes-Chatbot

# Requirements

Java 21 or newer

Maven 3.6.3 or newer

Spring Boot 3.3.4 or newer

Spring AI 1.0.0-M2 or newer       // I used Spring AI 1.0.0-M7


# How to get started

1. Set up your OpenAI key.

   -- visit platform.openai to create a new secret key for your account. In order to recieve a reponse, You have to purchase tokens from platform.openai. However, you can still run the application and view the chatbot without an API key.

2. Once you have you API key, go to application.properties file in your resources folder and enter your API key at: spring.ai.openai.api-key=Your-OpenAI-API-Key

<img width="1156" alt="Screenshot 2025-04-24 at 3 10 48 PM" src="https://github.com/user-attachments/assets/c7c51cef-5b45-4082-84fa-98f26d7e5199" />


3. To build this project, use the command:
  
   mvn clean install      


4. Command to run the application:
  
   mvn spring-boot:run
   
# Using the Application

5. After you run the program, enter http://localhost:8080/stream.html in your browser, to access the chatbot

# Special Thanks To:


  @danvega https://github.com/danvega - his coding youtube videos were critical for setting up this project.
  
  Collaborators - the following users were essential for creating this project: @nenechee, @AmaruRu, @J00958434, @Tsparks2003, Tmccoy02
