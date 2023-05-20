package com.project.Accounting.acc.journal.repository;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface JournalRepository extends JpaRepository<Journal, String> {

    @Query("SELECT new com.project.Accounting.acc.journal.dto.JournalDTO(" +
            "j.id, " +
            "j.slip.id, " +
            "j.balanceDivision, " +
            "j.acctInnerCode, " +
            "j.acctName, " +
            "j.cterCode, " +
            "j.leftDebtorPrice, " +
            "j.rightCreditsPrice) " +
            "FROM Journal j")
    List<JournalDTO> findAllJournals();

}
