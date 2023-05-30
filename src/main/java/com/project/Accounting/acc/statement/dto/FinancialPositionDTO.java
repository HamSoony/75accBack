package com.project.Accounting.acc.statement.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class FinancialPositionDTO {
    private String lev;
    private String category;
    private String acctName;
    private String balanceDetail;
    private String balanceSummary;
    private String periodNo;
    private String acctCode;

}
