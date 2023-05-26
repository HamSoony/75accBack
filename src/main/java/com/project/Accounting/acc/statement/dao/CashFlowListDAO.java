package com.project.Accounting.acc.statement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;


@Mapper
public interface CashFlowListDAO {

    HashMap<String, Object> callCashFlowList(HashMap<String, Object> param);
}
