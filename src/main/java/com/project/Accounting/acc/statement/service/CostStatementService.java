package com.project.Accounting.acc.statement.service;

import java.util.HashMap;

public interface CostStatementService {
    HashMap<String, Object> getCostStatement(String toDate);
}
