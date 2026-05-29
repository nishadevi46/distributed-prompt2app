package com.promt2app.distributed.account_service.dto.subscription;

public record UsageTodayResponse(
    Integer tokensUsed, Integer tokensLimit, Integer previewsRunning, Integer previewsLimit) {}
