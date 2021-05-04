package com.coopay.service;

import com.coopay.onboarding.entity.BankOfficer;
import com.coopay.onboarding.entity.Branch;
import com.coopay.repository.BankOfficerRepo;
import com.coopay.repository.BranchRepo;
import com.coopay.security.LoginData;
import com.coopay.security.OfficerLogin;
import com.coopay.security.RequestCredentials;
import com.coopay.utility.CommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManService {
    @Autowired
    BankOfficerRepo bankOfficerRepo;

    @Autowired
    BranchRepo branchRepo;



    public CommonMessage createOfficer(BankOfficer bankOfficer) {
        try{
            bankOfficerRepo.save(bankOfficer);
            
            //notifying the users via email
            
            return new CommonMessage().successMessage("Bank officer Account is created Succesfully!");

        }catch (Exception e){

            return new CommonMessage().errorMessage(e.getLocalizedMessage());

        }

    }

    public List<BankOfficer> getOfficerList() {
        return bankOfficerRepo.bankInformation();
    }

    public RequestCredentials getCredentials(String mobileNumber,String password){
        try {
            BankOfficer bankOfficer = bankOfficerRepo.getRequestCredentials(mobileNumber, password);
            return new RequestCredentials(bankOfficer.getBranchCode(), bankOfficer.getUserName(), bankOfficer.getCorePass());
        }catch (Exception e){
            return null;
        }

    }

    public CommonMessage addBranch(Branch branch) {
        try{
            branchRepo.save(branch);
            return new CommonMessage().successMessage("Branch Created Succesfully");

        }catch (Exception e){
            return new CommonMessage().errorMessage(e.getLocalizedMessage()) ;


        }

    }

    public List<Branch> branchList() {
        return branchRepo.getAllBranch();
    }

    public LoginData loginService(OfficerLogin officerLogin) {
        BankOfficer bankOfficer=   bankOfficerRepo
                .offocerLogin(officerLogin.getUserName(),officerLogin.getPassword());
        if(bankOfficer!=null)
        {
            return new LoginData(bankOfficer);
        }
                return new LoginData();
    }
}
