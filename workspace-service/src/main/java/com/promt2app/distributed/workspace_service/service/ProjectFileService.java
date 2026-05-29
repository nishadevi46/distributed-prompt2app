package com.promt2app.distributed.workspace_service.service;


import com.promt2app.distributed.common_lib.dto.FileTreeDto;
import com.promt2app.distributed.workspace_service.dto.project.FileContentResponse;

public interface ProjectFileService {

    FileTreeDto getFileTree(Long projectId);

    String getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
