package com.clientv1.amnclientv1.modles.client.attachment;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_client_attachment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentEntity extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_client_attachment", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_client_Attachment")
    private Long id;

    @Column(name = "attachment_name")
    private String attachmentName;

    @Column(name = "status")
    private String status;

    @Column(name = "note")
    private String note;

}
