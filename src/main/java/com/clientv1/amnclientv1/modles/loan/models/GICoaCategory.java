package com.clientv1.amnclientv1.modles.loan.models;


import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_gi_coa_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GICoaCategory extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_tbl_gl_coa_category", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_gl_coa_category")
    private Long id;

    @Column(name = "name_en")
    private String NameEn;

    @Column(name = "name_se")
    private String NameSe;

    @Column(name = "name_th")
    private String NameTh;

    @Column(name = "status")
    private String status;
}
