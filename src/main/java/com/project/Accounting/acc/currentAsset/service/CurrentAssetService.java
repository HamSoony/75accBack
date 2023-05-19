package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.entity.menu.CurrentAsset;

import java.util.List;

public interface CurrentAssetService {
//    List<CurrentAsset> getCurrentAssetByAcctCode(String acctCode);

    List<CurrentAsset> findAll();
    List<CurrentAsset> getCurrentAssetByAssetName(String assetName);
}
