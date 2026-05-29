package com.promt2app.distributed.workspace_service.service;


import com.promt2app.distributed.workspace_service.dto.project.DeployResponse;
import org.jspecify.annotations.Nullable;

public interface DeploymentService {
    @Nullable DeployResponse deploy(Long projectId);
}
