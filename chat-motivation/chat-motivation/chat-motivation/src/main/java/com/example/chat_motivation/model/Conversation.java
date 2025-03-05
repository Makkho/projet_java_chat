package com.example.chat_motivation.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    
    @Column(length = 500)
    private String message;
    
    @Column(length = 500)
    private String quoteResponse;
    
    private LocalDateTime timestamp;

    public Conversation() {
    	
    	
    }
    
    

    public Long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getMessage() {
    	
        return message;
        
    }

    public String getQuoteResponse() {
    	
        return quoteResponse;
        
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
        
    }

    public void setId(Long id) {
    	
        this.id = id;
        
    }
    public void setUserName(String userName) {
    	
        this.userName = userName;
        
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setQuoteResponse(String quoteResponse) {
        this.quoteResponse = quoteResponse;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp ;
    }
    
    
}
