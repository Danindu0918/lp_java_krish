package com.profilev1.amnprofilev1.service;

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
