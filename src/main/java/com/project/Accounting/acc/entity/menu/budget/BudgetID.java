package com.project.Accounting.acc.entity.menu.budget;

import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.acc.entity.menu.account.Account;
import com.project.Accounting.acc.entity.menu.period.Period;
import com.project.Accounting.hr.workplace.entity.Workplace;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class BudgetID implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    private Period period;

    @ManyToOne(fetch = FetchType.LAZY)
    private Budgeting_type budgeting_type;

    @ManyToOne(fetch = FetchType.LAZY)
    private Workplace workplace;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
}