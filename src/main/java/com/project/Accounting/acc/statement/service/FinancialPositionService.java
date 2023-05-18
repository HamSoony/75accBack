package com.project.Accounting.acc.statement.service;

import java.util.HashMap;

public interface FinancialPositionService {
    HashMap<String, Object> callFinancialPosition(String toDate);
}
