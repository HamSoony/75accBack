package com.project.Accounting.acc.statement.service;

import java.util.HashMap;

public interface MonthIncomeStatementService {

    HashMap<String, Object> getMonthIncomeStatement(String toDate);

}
