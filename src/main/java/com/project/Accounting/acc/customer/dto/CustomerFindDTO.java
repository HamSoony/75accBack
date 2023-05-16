package com.project.Accounting.acc.customer.dto;

import com.project.Accounting.acc.entity.menu.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CustomerFindDTO {

    @Column(name = "cter_code")
    private String id;
    private String wpCode;
    private String cterName;
    private String cterCeo;
    private String businessLicenseNumber;
    private String cterBusinessConditions;
    private String cterBusinessItems;
    private String cterBasicAddress;

    public CustomerFindDTO(Customer customer) {
        this.id = customer.getId();
        this.wpCode=customer.getWpCode();
        this.cterName = customer.getCterName();
        this.cterCeo = customer.getCterCeo();
        this.businessLicenseNumber = customer.getBusinessLicenseNumber();
        this.cterBusinessConditions = customer.getCterBusinessConditions();
        this.cterBusinessItems = customer.getCterBusinessItems();
        this.cterBasicAddress = customer.getCterBasicAddress();
    }
}
