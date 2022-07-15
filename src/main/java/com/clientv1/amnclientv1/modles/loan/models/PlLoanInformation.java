package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.modles.loan.plAccountType.PlAccountType;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_loan_information")
@Data
@AllArgsConstructor
public class PlLoanInformation {

    @Id
    @SequenceGenerator(name = "seq_pl_loan_information_type", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pl_loan_information_type")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pl_account_type_id")
    private PlAccountType plAccountType;

    @Column(name = "loan_information")
    private String attachmentName;
}
