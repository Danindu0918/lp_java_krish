package com.clientv1.amnclientv1.modles.client.attachment;

import java.util.List;

public interface AttachmentService {

    AttachmentDTO save (AttachmentDTO attachmentDTO);

    List<AttachmentDTO> getAllAttachment();

    AttachmentDTO update (AttachmentDTO attachmentDTO, long id);
}
