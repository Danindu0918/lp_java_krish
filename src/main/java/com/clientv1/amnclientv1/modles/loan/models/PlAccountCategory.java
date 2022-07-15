package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_account_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlAccountCategory extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_loan_pl_account_category", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_loan_pl_account_category")
    private Long id;

    @Column(name = "category_name", unique = true)
    private String categoryName;

    @Column
    private String status;
}
