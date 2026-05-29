package com.promt2app.distributed.intelligence_service.service;


import com.promt2app.distributed.intelligence_service.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
