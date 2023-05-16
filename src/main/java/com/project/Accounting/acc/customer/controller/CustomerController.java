package com.project.Accounting.acc.customer.controller;

import com.project.Accounting.acc.customer.dto.CustomerCodeDto;
import com.project.Accounting.acc.customer.dto.CustomerFindDTO;
import com.project.Accounting.acc.customer.service.CustomerService;
import com.project.Accounting.acc.entity.menu.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/acc/customer/")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customerList")
    public ResponseEntity<Map<String, Object>> getAccountCodeNameList(String workPlaceCode) {
        Map<String,Object> map = new HashMap<>();

        List<CustomerCodeDto> customerList = customerService.getCustomerCodes(workPlaceCode);

        if(customerList.size() == 0)
            return ResponseEntity.notFound().build();

        map.put("customerList",customerList);

        return ResponseEntity.ok(map);

    }

    //일반 거래처 조회
    @GetMapping("/customers")
    public ResponseEntity<List<CustomerFindDTO>> getCustomers(){
        List<CustomerFindDTO> customers = customerService.getCustomers();

        if(customers.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(customers);
    }

    // 일반 거래처 저장
    @PostMapping("/customer")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomers(customer);
    }

    //일반 거래처 삭제
    @DeleteMapping("/customer")
    public void deleteCustomer(@RequestParam String id){
        System.out.println("id ===================== " + id);
        customerService.deleteCustomer(id);
    }

    //일반 거재처 수정
    @PutMapping("/customer")
    public void updateCustomers(@RequestBody Customer customer){
        customerService.updateCustomers(customer);
    }

}
