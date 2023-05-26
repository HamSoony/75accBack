package com.project.Accounting.acc.entity.menu.curAsset;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CurrentAsset {

    @Id @GeneratedValue
    private String acctCode;

    private String acctName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="asset_code")
    private CurrentAssetDetail assetCode;

    private String assetName;

    private String progress;

    private String finalizeStatus;




}
