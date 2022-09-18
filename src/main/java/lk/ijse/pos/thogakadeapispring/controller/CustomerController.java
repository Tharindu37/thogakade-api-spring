package lk.ijse.pos.thogakadeapispring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @PostMapping("/save")
    public String saveCustomer(){
        return "saved";
    }

    public String UpdateCustomer(){
        return "updated";
    }
    public String DeleteCustomer(){
        return "deleted";
    }
    public String GetCustomer(){
        return "get";
    }
    public String GetAllCustomer() {
        return "all";
    }
}
