package com.profilev1.amnprofilev1.repository;

import com.clientv1.amnclientv1.modles.client.attachment.AttachmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentDTO, Long> {
}
