package com.project.Accounting.acc.entity.menu.account;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account_control_code {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_control_code")
    private Account_control_detail accountControlDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_inner_code")
    private Account account;



}
