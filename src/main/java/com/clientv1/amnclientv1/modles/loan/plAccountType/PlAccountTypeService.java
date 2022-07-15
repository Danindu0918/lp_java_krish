package com.clientv1.amnclientv1.modles.loan.plAccountType;

import com.clientv1.amnclientv1.modles.client.common.Exception.ObjectNotFound;
import com.clientv1.amnclientv1.modles.client.common.UserUtil;
import com.clientv1.amnclientv1.modles.loan.models.GICoa;
import com.clientv1.amnclientv1.modles.loan.models.PlAccountCategory;
import com.clientv1.amnclientv1.modles.loan.models.PlPolicy;
import com.clientv1.amnclientv1.modles.loan.plAccountType.payLoad.request.PlAccountTypeAddrequest;
import com.clientv1.amnclientv1.modles.loan.repository.GiCoaRepository;
import com.clientv1.amnclientv1.modles.loan.repository.PlPolicyRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
@AllArgsConstructor
@Data
public class PlAccountTypeService {

    private final PlAccountTyprRepository plAccountTyprRepository;
    private final GiCoaRepository giCoaRepository;
    private final PlPolicyRepository plPolicyRepository;
    private final UserUtil userUtil;
    private final ModelMapper modelMapper =new ModelMapper();


    public List getAllAccountType(){
        List respond = plAccountTyprRepository.findList();
        return respond;
    }

    public PlAccountType addAccountType(PlAccountTypeAddrequest plAccountTypeAddrequest, String token){

        PlAccountType temp = modelMapper.map(plAccountTypeAddrequest,PlAccountType.class);

        temp.setModifiedBy(userUtil.getUserIdFromToken(token));

        temp.setGlCoa(giCoaRepository.findById(plAccountTypeAddrequest.getGlCoa()).orElseThrow(()->new ObjectNotFound("Error : gl coa not found")));
        temp.setGlInterestId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInterestId()).orElseThrow(()->new ObjectNotFound("Error : gl interest rate not found")));
        temp.setGlPenaltyId(giCoaRepository.findById(plAccountTypeAddrequest.getGlPenaltyId()).orElseThrow(()->new ObjectNotFound("Error : gl penalty not found")));
        temp.setGlInsuranceId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInsuranceId()).orElseThrow(()->new ObjectNotFound("Error : gl insurance not found")));
        temp.setGlFeeId(giCoaRepository.findById(plAccountTypeAddrequest.getGlFeeId()).orElseThrow(()->new ObjectNotFound("Error : gl fee not found")));
        temp.setGlInterestResId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInterestResId()).orElseThrow(()->new ObjectNotFound("Error : gl interested res not found")));

        temp.setInterestPolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getInterestPolicy()).orElseThrow(()->new ObjectNotFound("Error : pl interest policy not found")));
        temp.setPenaltyPolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getPenaltyPolicy()).orElseThrow(()->new ObjectNotFound("Error : pl penalty policy policy not found")));
        temp.setInsurancePolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getInsurancePolicy()).orElseThrow(()->new ObjectNotFound("Error : pl insuarance policy not found")));
        temp.setFeePolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getFeePolicy()).orElseThrow(()->new ObjectNotFound("Error : pl fee policy not found")));

        return temp;
    }

    public PlAccountType updateAccountType(PlAccountTypeAddrequest plAccountTypeAddrequest, String token){

        PlAccountType temp = modelMapper.map(plAccountTypeAddrequest,PlAccountType.class);

        temp.setModifiedBy(userUtil.getUserIdFromToken(token));

        temp.setGlCoa(giCoaRepository.findById(plAccountTypeAddrequest.getGlCoa()).orElseThrow(()->new ObjectNotFound("Error : gl coa not found")));
        temp.setGlInterestId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInterestId()).orElseThrow(()->new ObjectNotFound("Error : gl interest rate not found")));
        temp.setGlPenaltyId(giCoaRepository.findById(plAccountTypeAddrequest.getGlPenaltyId()).orElseThrow(()->new ObjectNotFound("Error : gl penalty not found")));
        temp.setGlInsuranceId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInsuranceId()).orElseThrow(()->new ObjectNotFound("Error : gl insurance not found")));
        temp.setGlFeeId(giCoaRepository.findById(plAccountTypeAddrequest.getGlFeeId()).orElseThrow(()->new ObjectNotFound("Error : gl fee not found")));
        temp.setGlInterestResId(giCoaRepository.findById(plAccountTypeAddrequest.getGlInterestResId()).orElseThrow(()->new ObjectNotFound("Error : gl interested res not found")));

        temp.setInterestPolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getInterestPolicy()).orElseThrow(()->new ObjectNotFound("Error : pl interest policy not found")));
        temp.setPenaltyPolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getPenaltyPolicy()).orElseThrow(()->new ObjectNotFound("Error : pl penalty policy policy not found")));
        temp.setInsurancePolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getInsurancePolicy()).orElseThrow(()->new ObjectNotFound("Error : pl insuarance policy not found")));
        temp.setFeePolicy(plPolicyRepository.findById(plAccountTypeAddrequest.getFeePolicy()).orElseThrow(()->new ObjectNotFound("Error : pl fee policy not found")));

        return temp;
    }

    public List<GICoa> getGeneralLedgerList(){
        return giCoaRepository.findAllGeneralLedger();
    }

    public List<GICoa> getIncomeAccountList(){
        return giCoaRepository.findAllIncomeAccount();
    }

    public List<GICoa> getPenaltyAccountList(){
        return giCoaRepository.findAllPenaltyAccount();
    }

    public List<GICoa> getInsuranceAccountList(){
        return giCoaRepository.findAllInsuranceAccount();
    }

    public List<GICoa> getFeeAccountList(){
        return giCoaRepository.findAllInsuranceAccount();
    }

    public List<PlPolicy> getPassDue(){ return plPolicyRepository.getAllPassDueList();}
    public List<PlPolicy> getFeeAccount(){ return plPolicyRepository.getAllFeeAccountList();}
    public List<PlPolicy> getInsuarancePolicy(){ return plPolicyRepository.getAllInsuarancePlicyList();}
    public List<PlPolicy> getInterestPolicy(){ return plPolicyRepository.getAllInterestPolicyList();}
    public List<PlPolicy> getPenaltyPolicy(){ return plPolicyRepository.getAllPenaltyPolicyList();}


}
