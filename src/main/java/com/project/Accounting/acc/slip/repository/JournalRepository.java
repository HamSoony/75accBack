package com.project.Accounting.acc.slip.repository;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.slip.dto.JournalDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface JournalRepository extends JpaRepository<Journal, String> {

    @Query("SELECT new com.project.Accounting.acc.slip.dto.JournalDTO(" +
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
