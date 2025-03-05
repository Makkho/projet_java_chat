package com.example.quotes_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String text;

    public Quote() {
    	
    }

    public Quote(String text) {
    	
        this.text = text;
        
    }

    public Long getId() {
    	
        return id;
        
    }

    public String getText() {
    	
        return text;
        
    }

    public void setId(Long id) {
    	
        this.id = id;
        
    }
    

    public void setText(String text) {
        this.text = text;
    }
}
