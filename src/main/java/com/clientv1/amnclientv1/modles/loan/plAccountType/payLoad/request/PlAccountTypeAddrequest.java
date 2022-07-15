package com.clientv1.amnclientv1.modles.loan.plAccountType.payLoad.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlAccountTypeAddrequest {
    private long id;
    private String nameEn;
    private String nameSe;
    private String nameTh;
    private int periodMax;
    private int periodMin;
    private double interestRateMax;
    private double interestRateMin;
    private double penaltyRate;
    private double insuranceRate ;
    private double feeRate;
    private String status;
    private long organization;
    private long glCoa;
    private long glInterestId;
    private long glPenaltyId ;
    private long glInsuranceId ;
    private long glFeeId ;
    private long glInterestResId ;
    private long interestPolicy;
    private long penaltyPolicy;
    private long insurancePolicy;
    private long feePolicy;
}
