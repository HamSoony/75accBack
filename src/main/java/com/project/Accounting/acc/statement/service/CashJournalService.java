package com.project.Accounting.acc.statement.service;

import com.project.Accounting.acc.statement.dto.CashJournalDTO;

import java.util.ArrayList;

public interface CashJournalService {
    ArrayList<CashJournalDTO> getCashJournal(String fromDate, String toDate);
}
