package lk.ijse.pos.thogakadeapispring.service.impl;

import lk.ijse.pos.thogakadeapispring.dto.CustomerDTO;
import lk.ijse.pos.thogakadeapispring.repo.CustomerRepo;
import lk.ijse.pos.thogakadeapispring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void saveCustomer(CustomerDTO dto) {

    }
}

