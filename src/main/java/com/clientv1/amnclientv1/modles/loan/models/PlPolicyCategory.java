package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_policy_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlPolicyCategory extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_loan_pl_policy_category", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_loan_pl_policy_category")
    private Long id;

    @Column(name = "category_en", unique = true)
    private String categoryEnName;

    @Column(name = "category_se", unique = true)
    private String categorySeName;

    @Column(name = "category_th", unique = true)
    private String categoryThName;

    @Column
    private String status;

}
