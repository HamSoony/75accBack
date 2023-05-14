package com.project.Accounting.acc.entity.menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CurrentAsset {

    @Id @GeneratedValue
    private String acctCode;

    private String acctName;

    private String assetCode;

    private String assetName;

    private String progress;

    private String finalizeStatus;




}
