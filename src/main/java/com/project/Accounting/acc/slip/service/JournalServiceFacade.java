package com.project.Accounting.acc.slip.service;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.slip.dto.JournalDTO;

import java.util.List;

public interface JournalServiceFacade {

    List<JournalDTO> getJournalList();
}
