package com.project.Accounting.acc.statement.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class CashJournalDTO {
    private String monthReportingDate;
    private String reportingDate;
    private String expenseReport;
    private String customerCode;
    private String customerName;
    private int deposit;
    private int withdrawal;
    private String balance;
}
