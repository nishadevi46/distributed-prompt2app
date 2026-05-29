package com.promt2app.distributed.workspace_service.dto.member;



import com.promt2app.distributed.common_lib.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
