package com.coopay.onboarding.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_number")
public class AccountNumber {
    @Id
    private String accountNumber;

}
