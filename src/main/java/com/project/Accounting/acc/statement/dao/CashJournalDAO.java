package com.project.Accounting.acc.statement.dao;

import com.project.Accounting.acc.statement.dto.CashJournalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface CashJournalDAO {
    ArrayList<CashJournalDTO> selectCashJournalList(HashMap<String, Object> param);
}
