package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.currentAsset.repository.CurrentAssetDetailRepository;
import com.project.Accounting.acc.entity.menu.CurrentAssetDetail;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class CurrentAssetDetailServiceImpl implements CurrentAssetDetailService {
   @Autowired
   private CurrentAssetDetailRepository currentAssetDetailRepository;

    @Override
    public List<CurrentAssetDetail> findAll() {
        List<CurrentAssetDetail> all = currentAssetDetailRepository.findAll();
        return all;
    }

}
