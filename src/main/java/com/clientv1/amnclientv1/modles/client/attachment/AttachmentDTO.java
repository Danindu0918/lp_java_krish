package com.clientv1.amnclientv1.modles.client.attachment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentDTO {

    private Long id;
    private String clientCategory;
    private String attachmentName;
    private String status;
    private String note;
}
