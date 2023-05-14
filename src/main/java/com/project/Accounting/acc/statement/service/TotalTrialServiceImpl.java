package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dao.TotalTrialBalanceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TotalTrialServiceImpl implements TotalTrialService{

    @Autowired
    private TotalTrialBalanceDAO totalTrialBalanceDAO;


    @Override
    public HashMap<String, Object> getTotalTrialBalance(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        totalTrialBalanceDAO.callTotalTrialBalance(param);
        return param;
    }
}
