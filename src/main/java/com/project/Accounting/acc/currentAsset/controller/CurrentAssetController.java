package com.project.Accounting.acc.currentAsset.controller;

import com.project.Accounting.acc.currentAsset.service.CurrentAssetDetailService;
import com.project.Accounting.acc.currentAsset.service.CurrentAssetService;
import com.project.Accounting.acc.entity.menu.CurrentAsset;
import com.project.Accounting.acc.entity.menu.CurrentAssetDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/acc/currentAsset/")
@RequiredArgsConstructor
public class CurrentAssetController {

    @Autowired
    private CurrentAssetService currentAssetService;

    @Autowired
    private CurrentAssetDetailService currentAssetDetailService;

    @GetMapping("/assetList")
    public List<CurrentAsset> getAllList() {
        List<CurrentAsset> list = currentAssetService.findAll();
        return list;
    }

    @GetMapping("/findAssetName")
    public List<CurrentAsset> getCurrentAssetName(@RequestParam String assetName){
        List<CurrentAsset> currentAssetName = currentAssetService.getCurrentAssetByAssetName(assetName);
        return currentAssetName;
    }
//    @GetMapping("/findAssetByCodeList/{acctCode}")
//    public List<CurrentAsset> getCurrentAssetCodeNameList(@PathVariable("acctCode") String acctCode) {
//
//        List<CurrentAsset> currentAssetByAcctCode = currentAssetService.getCurrentAssetByAcctCode(acctCode);
//
//        return currentAssetByAcctCode;
//    }
//


    @GetMapping("/assetDetailList/")
    public List<CurrentAssetDetail> getAll() {

        List<CurrentAssetDetail> all = currentAssetDetailService.findAll();

        return all;
    }


}
