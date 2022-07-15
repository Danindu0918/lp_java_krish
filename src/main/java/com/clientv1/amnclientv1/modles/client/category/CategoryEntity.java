package com.clientv1.amnclientv1.modles.client.category;

import com.clientv1.amnclientv1.common.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_client_category", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sql_client_category")
    private Long id;

    @Column(name = "type_name", unique = true)
    private String categoryName;

    @Column(name = "prefix")
    private String prefix;

    @Column(name = "customer_number_length")
    private Integer customerNumberLength;

    @SequenceGenerator(name = "customer_last_number", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_last_number")
    private Integer customerLastNumber;

    @Column(name = "note")
    private String note;

    @Column(name = "is_nic")
    private Boolean isNic;

    @Column(name = "is_phone")
    private Boolean isPhone;

    @Column(name = "is_email")
    private Boolean isEmail;

    @Column(name = "branch")
    private String branch;

    @Column(name = "status")
    private String status;

}
