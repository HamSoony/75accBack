package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dto.FinancialPositionDTO;

import java.util.ArrayList;
import java.util.HashMap;

public interface FinancialPositionService {
    HashMap<String, Object> getFinancialPosition(String toDate);


}
