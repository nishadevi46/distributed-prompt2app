package com.promt2app.distributed.workspace_service.controller;


import com.promt2app.distributed.common_lib.dto.FileTreeDto;
import com.promt2app.distributed.workspace_service.dto.project.FileContentResponse;
import com.promt2app.distributed.workspace_service.service.ProjectFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {
  private final ProjectFileService projectFileService;

  @GetMapping
  public ResponseEntity<FileTreeDto> getFileTree(@PathVariable Long projectId) {
    Long userId = 1L;
    return ResponseEntity.ok(projectFileService.getFileTree(projectId));
  }

    @GetMapping("/content")
    public ResponseEntity<String> getFile(
            @PathVariable Long projectId,
            @RequestParam String path) {
        return ResponseEntity.ok(projectFileService.getFileContent(projectId, path));
    }
}
