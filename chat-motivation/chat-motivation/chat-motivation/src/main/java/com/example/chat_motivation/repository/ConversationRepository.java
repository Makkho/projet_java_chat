package com.example.chat_motivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.chat_motivation.model.Conversation;
import java.util.List;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
	
	
    List<Conversation> findByUserName(String userName);
    
    @Query("SELECT DISTINCT c.userName FROM Conversation c")
    List<String> findDistinctUserNames();
    
    
}
