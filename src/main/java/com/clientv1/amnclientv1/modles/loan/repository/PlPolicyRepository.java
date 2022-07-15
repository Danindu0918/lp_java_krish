package com.clientv1.amnclientv1.modles.loan.repository;

import com.clientv1.amnclientv1.modles.loan.models.PlPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlPolicyRepository extends JpaRepository<PlPolicy, Long> {

    @Query("from PlPolicy entity where entity.plPolicyCategory.id = 1")
    List<PlPolicy> getAllPassDueList();
    @Query("from PlPolicy entity where entity.plPolicyCategory.id = 2")
    List<PlPolicy> getAllInterestPolicyList();
    @Query("from PlPolicy entity where entity.plPolicyCategory.id = 3")
    List<PlPolicy> getAllPenaltyPolicyList();
    @Query("from PlPolicy entity where entity.plPolicyCategory.id = 5")
    List<PlPolicy> getAllInsuarancePlicyList();
    @Query("from PlPolicy entity where entity.plPolicyCategory.id = 4")
    List<PlPolicy> getAllFeeAccountList();

}
