package com.project.Accounting.acc.journal.service;

import com.project.Accounting.acc.journal.dto.JournalDTO;

import java.util.List;

public interface JournalServiceFacade {

    List<JournalDTO> getJournalList();
}
