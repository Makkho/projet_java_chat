package com.example.quotes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.quotes_api.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
	
	
	
}
