package com.clientv1.amnclientv1.modles.loan.plAccountType;

import com.clientv1.amnclientv1.modles.loan.plAccountType.payLoad.responsed.PlAccountTypeResponsed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlAccountTyprRepository extends JpaRepository<PlAccountType, Long> {

    @Query("select new com.clientv1.amnclientv1.modles.loan.plAccountType.payLoad.responsed.PlAccountTypeResponsed(entity.id , entity.nameEn , entity.glCoa.NameSe ,entity.status) from PlAccountType entity")
    List<PlAccountTypeResponsed> findList();
}
