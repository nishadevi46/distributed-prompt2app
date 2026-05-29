package com.promt2app.distributed.account_service.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}

