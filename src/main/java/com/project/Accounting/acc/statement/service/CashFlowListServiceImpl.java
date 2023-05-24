package com.project.Accounting.acc.statement.service;


import com.project.Accounting.acc.statement.dao.CashFlowListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CashFlowListServiceImpl implements CashFlowListService{

    @Autowired
    private CashFlowListDAO cashFlowListDAO;


    @Override
    public HashMap<String, Object> getCashFlowList(String toDate){
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        System.out.println("param =========== " + param);
       cashFlowListDAO.callCashFlowList(param);
        return param;
    }

}
