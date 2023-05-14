package com.project.Accounting.acc.slip.service;

import com.project.Accounting.acc.entity.menu.journal.JournalDetail;
import com.project.Accounting.acc.slip.repository.JournalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalDetailServiceImpl implements JournalDetailService{

    @Autowired
    private JournalDetailRepository journalDetailRepository;
    @Override
    public JournalDetail regiser(JournalDetail journalDetail) {
        JournalDetail saveJD = journalDetailRepository.save(journalDetail);
        return saveJD;
    }
}
