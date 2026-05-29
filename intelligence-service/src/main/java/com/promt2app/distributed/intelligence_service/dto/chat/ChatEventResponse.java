package com.promt2app.distributed.intelligence_service.dto.chat;


import com.promt2app.distributed.common_lib.enums.ChatEventType;

public record ChatEventResponse(
        Long id,
        ChatEventType type,
        Integer sequenceOrder,
        String content,
        String filePath,
        String metadata
) {
}
