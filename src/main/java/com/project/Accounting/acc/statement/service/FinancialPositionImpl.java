package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dao.FinancialPositionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FinancialPositionImpl implements FinancialPositionService{

    @Autowired
    private FinancialPositionDAO financialPositionDAO;

    @Override
    public HashMap<String, Object> callFinancialPosition(String toDate) {
        System.out.println("임플날짜"+toDate);

        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        financialPositionDAO.callFinancialPosition(param);
        System.out.println("파이낸션DAO 확인"+param);
        return param;
    }
}
