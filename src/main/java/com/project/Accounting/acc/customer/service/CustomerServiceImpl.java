package com.project.Accounting.acc.customer.service;

import com.project.Accounting.acc.customer.dto.CustomerCodeDto;
import com.project.Accounting.acc.customer.repository.CustomerRepository;
import com.project.Accounting.acc.entity.menu.Customer;
import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerCodeDto> getCustomerCodes(String wpCode) {

        List<Customer> accountList = customerRepository.findCustomersByWpCode(wpCode);

        List<CustomerCodeDto> dto = accountList.stream().map(CustomerCodeDto::new).collect(Collectors.toList());

        return dto;
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public void saveCustomers(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomers(Customer customer) {
        customerRepository.save(customer);

    }

}
