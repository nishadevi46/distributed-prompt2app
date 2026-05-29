package com.promt2app.distributed.account_service.dto.subscription;

public record PlanLimitsResponse(
    String planName, Integer maxTokensPerDay, Integer maxProjects, Boolean unlimitedAi) {}
