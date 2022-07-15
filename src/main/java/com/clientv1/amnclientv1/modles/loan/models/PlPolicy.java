package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_policy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlPolicy extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_loan_pl_policy", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_loan_pl_policy")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private PlPolicyCategory plPolicyCategory;

    @Column(name = "policy_name_en" ,unique = true)
    private String policyEnName;

    @Column(name = "policy_name_se" ,unique = true)
    private String policySeName;

    @Column
    private String note;

    @Column
    private String formula;

    @Column
    private String status;

    @Column(name = "organizaion_id")
    private String organization;
}
