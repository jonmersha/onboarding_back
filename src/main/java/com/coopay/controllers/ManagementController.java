package com.coopay.controllers;

import com.coopay.onboarding.entity.BankOfficer;
import com.coopay.onboarding.entity.Branch;
import com.coopay.security.LoginData;
import com.coopay.security.OfficerLogin;
import com.coopay.service.ManService;
import com.coopay.utility.CommonMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagementController {

    @Autowired
    ManService manService;

    @PostMapping("/man/create/officer")
    public CommonMessage addBankOfficer(@RequestBody BankOfficer bankOfficer){
        System.out.println(bankOfficer.getFirstName());
        return manService.createOfficer(bankOfficer);

    }

    @PostMapping("/man/create/branch")
    public CommonMessage addBranch(@RequestBody Branch branch){
        return manService.addBranch(branch);
    }
    @PostMapping("/officer/login")
    public LoginData login(@RequestBody OfficerLogin officerLogin){
    	 System.out.println(officerLogin.getUserName());

    	
        LoginData loginData=manService.loginService(officerLogin);
        System.out.println(loginData.getFirstName());

        return loginData;
    }
    
    @PostMapping("/officer/auth")
    public CommonMessage officerAuth(@RequestBody OfficerLogin officerLogin){
       // LoginData loginData=manService.loginService(officerLogin);
       // System.out.println(loginData.getFirstName());

        return new CommonMessage().successMessage("Officer Authorized");
    }
    
    @PostMapping("/officer/add_credentilas")
    public CommonMessage add_credentioals(@RequestBody OfficerLogin officerLogin){
       // LoginData loginData=manService.loginService(officerLogin);
       // System.out.println(loginData.getFirstName());

        return new CommonMessage().successMessage("Officer Authorized");
    }
    
    @PostMapping("/officer/enable")
    public CommonMessage enable_officer(@RequestBody OfficerLogin officerLogin){
       // LoginData loginData=manService.loginService(officerLogin);
       // System.out.println(loginData.getFirstName());

        return new CommonMessage().successMessage("Officer Authorized");
    }
    
    
    @PostMapping("/officer/dissable")
    public CommonMessage dissable_officer(@RequestBody OfficerLogin officerLogin){
        return new CommonMessage().successMessage("Officer Authorized");
    }



    @GetMapping("/man/officer")
    public List<BankOfficer> officerInfo(){
        return manService.getOfficerList();

    }

    @GetMapping("/man/branch/list")
    public List<Branch> branchList(){
        return manService.branchList();
    }
    @PostMapping("/onboarding/accountant/create")
    public CommonMessage createAccountant(@RequestBody BankOfficer bankOfficer){
        manService.createOfficer(bankOfficer);
        return null;
    }

    @GetMapping("/bnk/off")
    public BankOfficer getOfficerStraicture(){
        return new BankOfficer();
    }

    @GetMapping("/bnk/branch")
    public Branch branchStructure(){
        return new Branch();
    }
}
