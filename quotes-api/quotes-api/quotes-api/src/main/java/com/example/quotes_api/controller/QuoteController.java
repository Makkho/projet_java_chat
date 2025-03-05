package com.example.quotes_api.controller;

import com.example.quotes_api.model.Quote;

import com.example.quotes_api.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
    	
        this.quoteService = quoteService;
        
    }
    
    @GetMapping("/quote")
    public Quote getQuote() {
        return quoteService.getRandomQuote();
        
    }
    
}
