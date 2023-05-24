package com.project.Accounting.acc.statement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MonthIncomeStatementDAO {
    HashMap<String, Object> callMonthIncomeStatement(HashMap<String, Object> param);
}
