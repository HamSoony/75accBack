package com.project.Accounting.acc.currentAsset.controller;

import com.project.Accounting.acc.currentAsset.service.CurAssetService;
import com.project.Accounting.acc.entity.menu.curAsset.CurAsset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/acc/currentAsset")
public class CurAssetController {

    @Autowired
    private CurAssetService curAssetService;

    @GetMapping("/assetList")
    public List<CurAsset> getAllList() {
        List<CurAsset> list = curAssetService.findAll();
        return list;
    }

    @GetMapping("/findAssetName")
    public List<CurAsset> getCurAssetName(@RequestParam String assetName) {
        List<CurAsset> list = curAssetService.getCurAssetByAssetName(assetName);
        return list;
    }

    @PostMapping("/saveAsset")
    public void saveAsset(@RequestBody CurAsset asset){
        System.out.println("S"+asset);
        curAssetService.saveAsset(asset);
    }

}
