package com.example.quotes_api.service;

import org.springframework.stereotype.Service;
import com.example.quotes_api.model.Quote;
import com.example.quotes_api.repository.QuoteRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    private final QuoteRepository quoteRepository;
    
    private final Random random = new Random();

    public QuoteService(QuoteRepository quoteRepository) {
    	
        this.quoteRepository = quoteRepository;
    }
    

    public Quote getRandomQuote() {
    	
        List<Quote> quotes = quoteRepository.findAll();
        
        if(quotes.isEmpty()){
        	
            return null;
            
        }
        int index = random.nextInt(quotes.size());
        
        
        return quotes.get(index);
    }
}
