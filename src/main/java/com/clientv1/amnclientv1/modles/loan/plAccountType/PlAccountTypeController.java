package com.clientv1.amnclientv1.modles.loan.plAccountType;

import com.clientv1.amnclientv1.modles.loan.models.GICoa;
import com.clientv1.amnclientv1.modles.loan.plAccountType.payLoad.request.PlAccountTypeAddrequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/loan-pl-account-type")
@AllArgsConstructor
public class PlAccountTypeController {

    private PlAccountTypeService plAccountTypeService;

    @PostMapping("/add")
    public PlAccountType addAccountType(@RequestBody PlAccountTypeAddrequest plAccountTypeAddrequest, @RequestHeader(name="Authorization") String token){

        return plAccountTypeService.addAccountType(plAccountTypeAddrequest, token);
    }

    @PutMapping("/update")
    public PlAccountType updateAccountType(@RequestBody PlAccountTypeAddrequest plAccountTypeAddrequest, @RequestHeader (name="Authorization") String token){

        return plAccountTypeService.updateAccountType(plAccountTypeAddrequest ,token);
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getloanProductList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getAllAccountType() , HttpStatus.OK);
    }

    @GetMapping("/gl-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List<GICoa>> getGeneralLedgerList(){
        return new ResponseEntity<>(plAccountTypeService.getGeneralLedgerList() , HttpStatus.OK);
    }

    @GetMapping("/ia-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List<GICoa>> getIncomeAccountList(){
        return new ResponseEntity<>(plAccountTypeService.getIncomeAccountList() , HttpStatus.OK);
    }

    @GetMapping("/pa-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List<GICoa>> getPenaltyAccountList(){
        return new ResponseEntity<>(plAccountTypeService.getPenaltyAccountList() , HttpStatus.OK);
    }

    @GetMapping("/insa-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List<GICoa>> getInsuranceAccountList(){
        return new ResponseEntity<>(plAccountTypeService.getInsuranceAccountList() , HttpStatus.OK);
    }

    @GetMapping("/fa-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List<GICoa>> getFeeAccountList(){
        return new ResponseEntity<>(plAccountTypeService.getFeeAccountList() , HttpStatus.OK);
    }




    @GetMapping("/fa-policy-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getFeeAccountList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getFeeAccount(), HttpStatus.OK);
    }
    @GetMapping("/pp-policy-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getPenaltyPolicyList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getPenaltyPolicy(), HttpStatus.OK);
    }
    @GetMapping("/insp-policy-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getInsuarancePolicyList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getInsuarancePolicy(), HttpStatus.OK);
    }
    @GetMapping("/intp-policy-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getInterestPolicyList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getInterestPolicy(), HttpStatus.OK);
    }
    @GetMapping("/pd-policy-list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<List> getPassDueList(@RequestHeader(name="Authorization") String token){
        return new ResponseEntity<>(plAccountTypeService.getPassDue(), HttpStatus.OK);
    }
}
