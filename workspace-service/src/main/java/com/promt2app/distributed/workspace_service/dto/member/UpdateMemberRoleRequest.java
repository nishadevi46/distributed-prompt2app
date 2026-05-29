package com.promt2app.distributed.workspace_service.dto.member;


import com.promt2app.distributed.common_lib.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(@NotNull ProjectRole role) {}
