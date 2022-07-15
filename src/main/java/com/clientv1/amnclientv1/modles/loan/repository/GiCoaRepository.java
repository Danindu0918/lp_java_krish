package com.clientv1.amnclientv1.modles.loan.repository;

import com.clientv1.amnclientv1.modles.loan.models.GICoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GiCoaRepository extends JpaRepository<GICoa, Long> {

    @Query("from GICoa entity where entity.filter = 309")
    List<GICoa> findAllGeneralLedger();

    @Query("from GICoa entity where entity.filter = 102")
    List<GICoa> findAllIncomeAccount();

    @Query("from GICoa entity where entity.filter = 108 or entity.filter = 102")
    List<GICoa> findAllPenaltyAccount();

    @Query("from GICoa entity where entity.filter = 108")
    List<GICoa> findAllInsuranceAccount();

    @Query("from GICoa entity where entity.filter = 108")
    List<GICoa> findAllFeeAccount();
}
