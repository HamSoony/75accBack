package com.project.Accounting.acc.entity.menu.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Account_control_detail {
    @Id
    @Column(name = "acc_control_code")
    private String id;

    @OneToMany(mappedBy = "accountControlDetail")
    private List<Account_control_code> accountControlCode;


    private String acctControlName;


    private String acctControlType;


    private String description;




}
