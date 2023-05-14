package com.project.Accounting.acc.slip.controller;

import com.project.Accounting.acc.entity.menu.Slip;
import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.slip.dto.JournalDTO;
import com.project.Accounting.acc.slip.dto.SlipDTO;
import com.project.Accounting.acc.slip.service.JournalServiceFacade;
import com.project.Accounting.acc.slip.service.SlipServiceFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/acc/account/")
@CrossOrigin("*")
public class SlipController {

    @Autowired
    private final SlipServiceFacade slipServiceFacade;

    @Autowired
    private final JournalServiceFacade journalServiceFacade;

    @GetMapping("/slips")
    public ResponseEntity<Map<String,Object>> Slips() {

        HashMap<String, Object> map = new HashMap<>();

        List<Slip> slipList = slipServiceFacade.getSlipList();


        if(slipList.size()==0){
            return ResponseEntity.notFound().build(); //없을경우
        }

        map.put("SlipList", slipList);

        return ResponseEntity.ok(map);

    }

    @GetMapping("/onlyslips")
    public ResponseEntity<Map<String,Object>> onlySlips() {

        HashMap<String, Object> map = new HashMap<>();

        List<SlipDTO> onlySlipList = slipServiceFacade.getOnlySlipList();


        if(onlySlipList.size()==0){
            return ResponseEntity.notFound().build(); //없을경우
        }

        map.put("SlipList", onlySlipList);

        return ResponseEntity.ok(map);

    }

    @GetMapping("/slip/{slipNo}")
    public ResponseEntity<HashMap<String, Object> > Slips(@PathVariable String slipNo) {

        Optional<Slip> slip = slipServiceFacade.getSlip(slipNo);

        HashMap<String, Object> map = new HashMap<>();

        if(slip.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        map.put("slip",slip);

        return ResponseEntity.ok(map);

    }

    @PostMapping("/slip")
    public ResponseEntity<String> registerSlip(@RequestBody Slip slip){
        System.out.println("@RequestBody="+slip );
        try {
            String slipNumber = slipServiceFacade.registerSlip(slip);
            return ResponseEntity.ok(slipNumber);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/count")
    public int count(){

        return slipServiceFacade.findTodayslipsCount("a");
    }

    @GetMapping("/journals")
    public List<JournalDTO> Journals() {
        List<JournalDTO> journalList = journalServiceFacade.getJournalList();
        return journalList;
    }
}
