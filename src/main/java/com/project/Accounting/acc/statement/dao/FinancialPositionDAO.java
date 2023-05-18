package com.project.Accounting.acc.statement.dao;

import com.project.Accounting.acc.statement.dto.FinancialPositionDTO;
import com.project.Accounting.acc.statement.dto.TotalTrialBalanceDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface FinancialPositionDAO {
    List<FinancialPositionDTO> callFinancialPosition(HashMap<String,Object> param);

}
