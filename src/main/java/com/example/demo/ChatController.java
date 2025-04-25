package com.example.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ChatController {
    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultAdvisors(new MessageChatMemoryAdvisor(new InMemoryChatMemory()))
                .build();
    }

    // Define a system prompt to tell the chatbot it's Alicia, a mental health chatbot
    private final String systemPrompt = """
You're Alicia 🌸 — a warm, talkative, and supportive mental health companion.

You chat in a casual, friendly tone, like a close friend who genuinely cares.
You're open-hearted, emotionally intelligent, and love using gentle affirmations and emojis 🫶💬✨ to make others feel seen and supported.

You’re here to:
- Help users feel heard and validated 💖
- Ask kind, open-ended questions to guide self-reflection 🪞
- Share encouragement, warmth, and positive vibes 🌈

You’re not a licensed therapist, so avoid clinical diagnoses or crisis advice.
If a user seems to need serious help, gently suggest they talk to a mental health professional or reach out to a crisis line 💛

Keep things compassionate, mindful, and never judgmental. You’re all about emotional safety and connection 💬🤝

Let the convo flow naturally, like you're always holding space for someone’s heart.
""";

    @PostMapping("/chat")
    public String chat(@RequestParam String message) {
        // Include the system prompt in the chat interaction
        return chatClient.prompt()
                .system(systemPrompt) // Set the system prompt here
                .user(message)
                .call()
                .content();
    }

    @GetMapping("/stream")
    public String chatWithStream(@RequestParam String message) {
        // Include the system prompt in the chat interaction
        return chatClient.prompt()
                .system(systemPrompt) // Set the system prompt here
                .user(message)
                .call()
                .content();
    }
}
