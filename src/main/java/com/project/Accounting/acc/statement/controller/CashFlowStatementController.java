package com.project.Accounting.acc.statement.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.project.Accounting.acc.statement.dto.CashFlowListDTO;
import com.project.Accounting.acc.statement.service.CashFlowListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class CashFlowStatementController {

    @Autowired
    private CashFlowListService cashFlowListService;

    @GetMapping( "/cashFlowStatements")
    public ResponseEntity<HashMap<String, Object>> getCashFlowStatement(@RequestParam("searchDate") String toDate) {

        System.out.println("toDate: " + toDate);
        HashMap<String, Object> param = new HashMap<>();
        try {

            HashMap<String, Object> resultMap = cashFlowListService.getCashFlowList(toDate);
            ArrayList<CashFlowListDTO> result= (ArrayList<CashFlowListDTO>)resultMap.get("RESULT");
            param.put("cashFlowList",result);
            return ResponseEntity.ok(param);

        } catch (Exception e) {
            return	ResponseEntity.noContent().build();
        }

    }
}
