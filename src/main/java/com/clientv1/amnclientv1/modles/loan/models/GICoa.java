package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.common.Auditable;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_gl_coa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GICoa extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_tbl_gl_coa", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_gl_coa")
    private Long id;

    @Column(name = "name_en")
    private String NameEn;

    @Column(name = "name_se")
    private String NameSe;

    @Column(name = "name_th")
    private String NameTh;

    @Column(name = "filter")
    private int filter;

    @Column(name = "status")
    @NotNull
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id")
    private GICoaSubCategory glCoaSubCategory;

    //organization id
    @Column(name = "organization_id")
    private long organization;
}
