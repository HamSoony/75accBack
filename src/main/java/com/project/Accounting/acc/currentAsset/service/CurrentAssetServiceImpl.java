package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.currentAsset.repository.CurrentAssetRepository;
import com.project.Accounting.acc.entity.menu.CurrentAsset;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CurrentAssetServiceImpl implements CurrentAssetService {

    @Autowired
    private final CurrentAssetRepository currentAssetRepository;

//    @Override
//    public List<CurrentAsset> getCurrentAssetByAcctCode(String acctCode) {
//        List<CurrentAsset> currentAssetByAcctCode = currentAssetRepository.findCurrentAssetByAcctCode(acctCode);
//        return currentAssetByAcctCode;
//    }
//
    @Override
    public List<CurrentAsset> getCurrentAssetByAssetName(String assetName) {
        List<CurrentAsset> currentAssetName = currentAssetRepository.findCurrentAssetByAssetName(assetName);
        return currentAssetName;
}

    public List<CurrentAsset> findAll(){
        List<CurrentAsset> list = currentAssetRepository.findAll();
        return list;
    }



}
