package com.promt2app.distributed.intelligence_service.repository;


import com.promt2app.distributed.intelligence_service.entity.ChatSession;
import com.promt2app.distributed.intelligence_service.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}

