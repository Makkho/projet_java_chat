package com.example.chat_motivation.controller;

import com.example.chat_motivation.model.Conversation;
import com.example.chat_motivation.service.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String showChatForm(Model model) {
    	
        model.addAttribute("conversation", new Conversation());
        return "chat";
        
    }

  

    @GetMapping("/admin")
    public String admin(Model model, @RequestParam(required = false) String userName) {
        List<Conversation> conversations;
        if (userName != null && !userName.isEmpty()) {
            conversations = chatService.getConversationsByUser(userName);
        } else {
            conversations = chatService.getAllConversations();
        }
        model.addAttribute("conversations", conversations);
        /* liste des noms */
        model.addAttribute("userNames", chatService.getDistinctUserNames());
        return "admin";
    }
    @PostMapping("/retour")
    public String sendMessage(@ModelAttribute Conversation conversation, Model model) {
        Conversation savedConversation = chatService.saveMessage(conversation.getUserName(), conversation.getMessage());
        model.addAttribute("response", savedConversation.getQuoteResponse());
        return "chat";
    }
    
}
