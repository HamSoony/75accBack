package com.project.Accounting.acc.statement.dao;

import com.project.Accounting.acc.statement.dto.TotalTrialBalanceDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TotalTrialBalanceDAO {
    public HashMap<String, Object> addEarlyStatements(String toDate);
    List<TotalTrialBalanceDTO> callTotalTrialBalance(HashMap<String,Object> param);
}
