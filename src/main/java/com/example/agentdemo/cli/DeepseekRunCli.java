package com.example.agentdemo.cli;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class DeepseekRunCli implements CommandLineRunner {

    private final ChatModel chatModel;

    public DeepseekRunCli(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public void run(String... args) throws Exception {
        String response = chatModel.call("hello");

        System.out.println(response);
    }
}
