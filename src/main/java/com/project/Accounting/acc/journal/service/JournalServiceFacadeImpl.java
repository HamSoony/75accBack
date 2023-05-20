package com.project.Accounting.acc.journal.service;

import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceFacadeImpl implements JournalServiceFacade{

    @Autowired
    private JournalRepository journalRepository;
    @Override
    public List<JournalDTO> getJournalList() {
        List<JournalDTO> journals = journalRepository.findAllJournals();


        return journals;
    }
}
