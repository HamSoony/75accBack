package com.project.Accounting.acc.statement.dto;

import lombok.Data;

@Data
public class TotalTrialBalanceDTO {
    private int lev;
    private String acctName;
    private String acctInnerCode;
    private int debitsSumBalance;
    private int debitsSum;
    private int creditsSum;
    private int creditsSumBalance;

}
