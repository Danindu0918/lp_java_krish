package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.modles.loan.plAccountType.PlAccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_loan_attachment_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlLoanAttachmentType {

    @Id
    @SequenceGenerator(name = "seq_pl_property_attachment_type", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pl_property_attachment_type")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pl_account_type_id")
    private PlAccountType plAccountType;

    @Column(name = "attachment_name")
    private String attachmentName;
}
