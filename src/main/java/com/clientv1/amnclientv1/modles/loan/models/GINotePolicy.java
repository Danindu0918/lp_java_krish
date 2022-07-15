package com.clientv1.amnclientv1.modles.loan.models;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tbl_gl_note_policy")
@AllArgsConstructor
@NoArgsConstructor
public class GINotePolicy extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_tbl_gl_note_policy", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_gl_note_policy")
    private long id;

    @Column(name = "note_int")
    private int noteInt;

    @Column(name = "note_name")
    @NotBlank(message = "note name is required")
    private String noteName;

    @Column(name = "report")
    private String report;
}
