package com.coopay.repository;

import com.coopay.onboarding.entity.CustomerAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerAccountRepo extends CrudRepository<CustomerAccount,Integer> {

    @Query("SELECT u from CustomerAccount u where u.mobileNumber=?1")
    CustomerAccount getCustomerByPhone(String phone);

    @Query("SELECT u from CustomerAccount u ")
    List<CustomerAccount> getAllCustomer();

    @Query("SELECT u from CustomerAccount u where u.transactionId=?1 ")
    CustomerAccount getCustomerByTransactionId(String customerID);

    @Query("SELECT u from CustomerAccount u where u.accountNumber=?1 ")
    CustomerAccount getCustomerByAccount(String accountNumber);
}
