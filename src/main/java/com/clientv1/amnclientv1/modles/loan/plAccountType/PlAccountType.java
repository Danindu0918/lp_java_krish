package com.clientv1.amnclientv1.modles.loan.plAccountType;

import com.clientv1.amnclientv1.common.Auditable;
import com.clientv1.amnclientv1.modles.loan.models.GICoa;
import com.clientv1.amnclientv1.modles.loan.models.PlAccountCategory;
import com.clientv1.amnclientv1.modles.loan.models.PlPolicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pl_account_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlAccountType extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_tbl_pl_account_type", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_pl_account_type")
    private long id;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "name_se")
    private String nameSe;

    @Column(name = "name_th")
    private String nameTh;

    @Column(name = "period_max")
    private int periodMax;

    @Column(name = "period_min")
    private int periodMin;

    @Column(name = "interest_rate_max")
    private double interestRateMax;

    @Column(name = "interest_rate_min")
    private double interestRateMin;

    @Column(name = "penalty_rate")
    private double penaltyRate;

    @Column(name = "insurance_rate")
    private double insuranceRate ;

    @Column(name = "fee_rate")
    private double feeRate;

    @Column(name = "status")
    private String status;

    //organization id
    @Column(name = "organization_id")
    private long organization;



    //relationships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_coa_id")
    private GICoa glCoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_interest_id ")
    private GICoa glInterestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_penalty_id")
    private GICoa glPenaltyId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_insurance_id")
    private GICoa glInsuranceId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_fee_id")
    private GICoa glFeeId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gl_interest_res_id")
    private GICoa glInterestResId ;





    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interest_policy")
    private PlPolicy interestPolicy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "penalty_policy")
    private PlPolicy penaltyPolicy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_policy")
    private PlPolicy insurancePolicy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fee_policy")
    private PlPolicy  feePolicy;





    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pl_account_category_id")
    private PlAccountCategory plAccountCategory;
}
