package com.promt2app.distributed.account_service.dto.auth;

public record AuthResponse(String token, UserProfileResponse user) {}
