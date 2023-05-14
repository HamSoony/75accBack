package com.project.Accounting.acc.entity.menu.account;

import com.project.Accounting.acc.entity.menu.period.Income_statement;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @Column(name = "acct_inner_code")
    private String id;

    private String parentAcctInnerCode;

    private String acctCode;


//    @OneToMany(mappedBy = "id.acc", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgets;


    private String acctCharacter;

    private String acctName;

    private String acctDisplayNameWithCode;

    private String acctDisplayName;

    private String acctDivision;

    private String acctUseCheck;

    private String acctDescription;


    private String groupCode;

    private Boolean editable;

    private String target;

    private String budget;


}
