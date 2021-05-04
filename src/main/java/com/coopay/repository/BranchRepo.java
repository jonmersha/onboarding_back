package com.coopay.repository;

import com.coopay.onboarding.entity.BankOfficer;
import com.coopay.onboarding.entity.Branch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BranchRepo extends CrudRepository<Branch,String> {

    @Query("select u from Branch u where u.branchName=?1")
    BankOfficer getBranchByName(String branchName);

    @Query("select u from Branch u")
    List<Branch> allBranch();

    @Query("select u from Branch u")
    List<Branch> getAllBranch();
}
