package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.entity.menu.CurrentAsset;

import java.util.List;

public interface CurrentAssetService {
    List<CurrentAsset> getCurrentAssetsByAcctCode(String acctCode);
    List<CurrentAsset> getCurrentAssetsByAcctName(String acctName);

    List<CurrentAsset> findAll();
}
