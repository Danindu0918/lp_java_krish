package com.clientv1.amnclientv1.modles.client.attachment;

import com.clientv1.amnclientv1.modles.client.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AttachmentServiceImpl implements AttachmentService {

    private final AttachmentRepository attachmentRepository;


    @Override
    public AttachmentDTO save(AttachmentDTO attachmentDTO) {
        if (attachmentDTO.getAttachmentName().trim().equals(null) || attachmentDTO.getAttachmentName().trim().equals(""))
            throw new RuntimeException("Error : attachment name is invalid.....");
        return attachmentRepository.save(attachmentDTO);
    }

    @Override
    public List<AttachmentDTO> getAllAttachment() {
        return attachmentRepository.findAll();
    }

    @Override
    public AttachmentDTO update(AttachmentDTO attachmentDTO, long id) {

        AttachmentDTO attachment = attachmentRepository.findById(id).orElseThrow(() -> new
                ResourceNotFoundException("ClientAttachment", "Id", id));

        attachment.setAttachmentName(attachmentDTO.getAttachmentName());
        attachment.setClientCategory(attachmentDTO.getClientCategory());
        attachment.setStatus(attachmentDTO.getStatus());
        attachment.setNote(attachmentDTO.getNote());

        attachmentRepository.save(attachment);
        return attachment;
    }
}
