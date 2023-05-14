package com.project.Accounting.acc.currentAsset.repository;

import com.project.Accounting.acc.entity.menu.CurrentAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrentAssetRepository extends JpaRepository<CurrentAsset, String> {

    List<CurrentAsset> findCurrentAssetByAcctCode(String acctCode);
    List<CurrentAsset> findCurrentAssetByAcctName(String acctName);

    List<CurrentAsset> findAll();

    
}
