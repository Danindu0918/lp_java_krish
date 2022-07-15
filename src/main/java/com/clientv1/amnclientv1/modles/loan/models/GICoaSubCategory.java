package com.clientv1.amnclientv1.modles.loan.models;


import com.clientv1.amnclientv1.common.Auditable;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_gi_coa_sub_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GICoaSubCategory extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_tbl_gl_coa_sub_category", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_gl_coa_sub_category")
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

    //relation ships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_coa_category_id ")
    private GICoaCategory glCoaCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tbl_gl_note_policy")
    private GINotePolicy glNotePolicy;
}
