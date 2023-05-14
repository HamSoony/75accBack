package com.project.Accounting.acc.statement.service;

import java.util.HashMap;

public interface IncomeStatementService {
    HashMap<String, Object> getIncomeStatement(String toDate);

}
