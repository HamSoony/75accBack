package com.project.Accounting.acc.entity.menu.curAsset;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CurrentAssetDetail {

    @Id  @GeneratedValue
    private String assetCode;
    private String acquistionCost;
    private String depreciation;
    private String bookValue;
    private String amortizationWay;
    private String amortizationFinalYear;
    private String usefullife;
    private String amortizationRate;
    private String month;
    private String normalAmortization;
    private String raccumulatedAmortization;
    private String accumulatedAmortization;
    private String bookValueend;
}
