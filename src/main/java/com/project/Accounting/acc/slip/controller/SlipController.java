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

    @GetMapping("/slip/{SlipNo}")
    public ResponseEntity<HashMap<String,Slip>> getSlipById(@PathVariable("SlipNo") String id){
        HashMap<String, Slip> map = new HashMap<>();

        Optional<Slip> slip = slipServiceFacade.getSlip(id);

        if(slip.isEmpty()){
            return ResponseEntity.badRequest().build();
        }

        map.put("slip", slip.get());

        return ResponseEntity.ok(map);
    }

    @GetMapping("/journals")
    public List<JournalDTO> Journals() {
        List<JournalDTO> journalList = journalServiceFacade.getJournalList();
        return journalList;
    }

    @PutMapping("/slip")
    public ResponseEntity<HashMap<String,Slip>> UpdateSlip(@RequestBody Slip slip){
        HashMap<String,Slip> map = new HashMap<>();
        try {
            Slip save = slipServiceFacade.SlipUpdate(slip);
            map.put("slip",save);
            return ResponseEntity.ok(map);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
