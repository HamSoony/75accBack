package com.project.Accounting.acc.statement.service;

import java.util.HashMap;

public interface TotalTrialService {
    HashMap<String, Object> getTotalTrialBalance(String toDate);
}
