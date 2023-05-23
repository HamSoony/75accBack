package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dao.MonthIncomeStatementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MonthIncomeServiceImpl implements MonthIncomeStatementService {

    @Autowired
    private MonthIncomeStatementDAO monthIncomeStatementDAO;

    @Override
    public HashMap<String, Object> getMonthIncomeStatement(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        String year = toDate.substring(0,4);
        param.put("year", year);
        monthIncomeStatementDAO.callMonthIncomeStatement(param);
        return param;
    }
}
