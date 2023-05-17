package com.project.Accounting.acc.statement.dto;


import lombok.Data;

@Data
public class CashFlowListDTO {
    private String accountInnerCode;
    private String accountName;
    private String parentAccountCode;
    private String cashFlow;
    private String cashFlowSummary;
    private String earlyCashFlow;
    private String earlyCashFlowSummary;
}
