package com.project.Accounting.acc.journal.controller;

import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.service.JournalServiceFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/acc/account/")
@CrossOrigin("*")
public class JournalController {

    @Autowired
    private final JournalServiceFacade journalServiceFacade;

    @GetMapping("/journals")
    public List<JournalDTO> Journals() {
        List<JournalDTO> journalList = journalServiceFacade.getJournalList();
        return journalList;
    }


}
