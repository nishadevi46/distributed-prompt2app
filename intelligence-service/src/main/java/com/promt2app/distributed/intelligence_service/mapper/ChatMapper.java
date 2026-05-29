package com.promt2app.distributed.intelligence_service.mapper;


import com.promt2app.distributed.intelligence_service.dto.chat.ChatResponse;
import com.promt2app.distributed.intelligence_service.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}