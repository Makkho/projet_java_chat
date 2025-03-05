package com.example.chat_motivation.service;

import com.example.chat_motivation.model.Conversation;
import com.example.chat_motivation.model.Quote;
import com.example.chat_motivation.repository.ConversationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatService {

    private final ConversationRepository conversationRepository;
    
    private final RestTemplate restTemplate;
    
    private final String quoteApiUrl = "http://localhost:8081/quote";

    public ChatService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
        this.restTemplate = new RestTemplate();
    }

    public Conversation saveMessage(String userName, String message) {
        Quote quote = restTemplate.getForObject(quoteApiUrl, Quote.class);
        Conversation conversation = new Conversation();
        conversation.setUserName(userName);
        conversation.setMessage(message);
        conversation.setQuoteResponse(quote != null ? quote.getText() : "Pas de citation dispo");
        conversation.setTimestamp(LocalDateTime.now());
        return conversationRepository.save(conversation);
    }
    public List<Conversation> getAllConversations() {
        return conversationRepository.findAll();
    }
    public List<Conversation> getConversationsByUser(String userName) {
        return conversationRepository.findByUserName(userName);
    }
    
    /* liste des noms */
    public List<String> getDistinctUserNames() {
        return conversationRepository.findDistinctUserNames();
    }
}
