package com.project.Accounting.acc.currentAsset.repository;

import com.project.Accounting.acc.entity.menu.CurrentAssetDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrentAssetDetailRepository extends JpaRepository<CurrentAssetDetail, String>{

    List<CurrentAssetDetail> findAll();

}
