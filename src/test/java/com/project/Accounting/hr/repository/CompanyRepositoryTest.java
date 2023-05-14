package com.project.Accounting.hr.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class CompanyRepositoryTest {


    @Autowired
    private CompanyRepository companyRepository;


    @Test
    public void companyList(){

        List<Company> all = companyRepository.findAll();

        System.out.println("컴퍼니" + all.get(0).getId());

    }



}