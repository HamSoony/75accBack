package com.project.Accounting.acc.entity.menu.journal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.Accounting.acc.entity.menu.Slip;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Journal {

    @Id
    @Column(name = "journal_no")
    private String id;

    @OneToOne(mappedBy = "id.journal",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("id")
    private JournalDetail journalDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "slip_no")
    private Slip slip;

    private String balanceDivision;

    private String acctInnerCode;

    private String acctName;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cter_code")
    private String cterCode;

    private String cterName;

    private Long leftDebtorPrice;

    private Long rightCreditsPrice;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_inner_code")
//    private Account account;




}
