package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dao.FinancialPositionDAO;
import com.project.Accounting.acc.statement.dto.FinancialPositionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FinancialPositionImpl implements FinancialPositionService{

    @Autowired
    private FinancialPositionDAO financialPositionDAO;

    @Override
    public HashMap<String, Object> getFinancialPosition(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);


        financialPositionDAO.callFinancialPosition(param);
        System.out.println(param);
        //System.out.println("파이낸셜 DAO 확인"+bb);
        return  param;
    }
}
