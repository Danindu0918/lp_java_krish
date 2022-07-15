package com.clientv1.amnclientv1.modles.client.attachment;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/attachment")
@AllArgsConstructor
public class AttachmentController {

    private AttachmentService attachmentService;

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<AttachmentDTO> save (@RequestBody AttachmentDTO attachmentDTO){
        return new ResponseEntity<>(attachmentService.save(attachmentDTO), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<AttachmentDTO> getAll(){
        return attachmentService.getAllAttachment();
    }

    public ResponseEntity<AttachmentDTO> update (@PathVariable("id") long id, @RequestBody AttachmentDTO attachmentDTO){
        return new ResponseEntity<AttachmentDTO>(attachmentService.update(attachmentDTO, id), HttpStatus.OK);
    }
}
