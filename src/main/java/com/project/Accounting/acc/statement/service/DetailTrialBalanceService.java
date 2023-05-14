package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dto.DetailTrialBalanceDTO;

import java.util.ArrayList;

public interface DetailTrialBalanceService {
    ArrayList<DetailTrialBalanceDTO> getDetailTrialBalance(String fromDate, String toDate);
}
