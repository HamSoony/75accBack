package com.project.Accounting.acc.statement.controller;

import com.project.Accounting.acc.statement.dto.FinancialPositionDTO;
import com.project.Accounting.acc.statement.dto.TotalTrialBalanceDTO;
import com.project.Accounting.acc.statement.service.FinancialPositionService;
import com.project.Accounting.acc.statement.service.TotalTrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;


@RequestMapping("/acc/statement")
@RestController
@CrossOrigin("*")
public class FinancialPositionController {
    @Autowired
    private FinancialPositionService financialPositionService;

    @GetMapping("/financialPositions")
    public ResponseEntity<HashMap<String, Object>> callFinancialPosition(@RequestParam("searchDate") String toDate) {

        System.out.println(".컨트롤러 날짜"+toDate);

        HashMap<String, Object> param = new HashMap<>();
        try{
            HashMap<String, Object> resultMap = financialPositionService.callFinancialPosition(toDate);
            ArrayList<FinancialPositionDTO> result= (ArrayList<FinancialPositionDTO>)resultMap.get("RESULT");
            param.put("financialPositions", result);
            return ResponseEntity.ok(param);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        }


    }
}