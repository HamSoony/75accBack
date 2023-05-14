package com.project.Accounting.hr.repository.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
class SlipRepositoryTest {

    @Autowired
    SlipRepository slipRepository;

    @Autowired
    JournalRepository journalRepository;

    @PersistenceContext
    private EntityManager em;


}