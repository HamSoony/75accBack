package com.project.Accounting.acc.statement.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class FinancialPositionDTO {
    private int lev;
    private String category;
    private String acctName;
    private int balanceDetail;
    private int balanceSummary;
    private int periodNo;
    private String acctCode;

//    private int prebalancesummary;
//
//    private int prebalancedetail;

}
