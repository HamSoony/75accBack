package com.project.Accounting.acc.slip.service;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.slip.dto.JournalDTO;
import com.project.Accounting.acc.slip.repository.JournalRepository;
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
