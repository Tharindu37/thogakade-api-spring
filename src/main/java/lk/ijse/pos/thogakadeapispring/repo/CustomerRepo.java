package lk.ijse.pos.thogakadeapispring.repo;

import lk.ijse.pos.thogakadeapispring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {

}
