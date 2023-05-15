package com.project.Accounting.acc.slip.service;

import com.project.Accounting.acc.entity.menu.Slip;
import com.project.Accounting.acc.slip.dto.SlipDTO;

import java.util.List;
import java.util.Optional;

public interface SlipServiceFacade {

    List<Slip> getSlipList();

    List<SlipDTO> getOnlySlipList();

    Optional<Slip> getSlip(String slipId);

    String registerSlip(Slip slip);

    int findTodayslipsCount(String date);

    Slip SlipUpdate(Slip slip);

}
