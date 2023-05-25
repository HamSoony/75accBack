package com.project.Accounting.acc.statement.service;

import java.util.HashMap;


public interface CashFlowListService {
    HashMap<String, Object> getCashFlowList(String toDate);
}
