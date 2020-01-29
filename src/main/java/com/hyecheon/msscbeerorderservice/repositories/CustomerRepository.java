package com.hyecheon.msscbeerorderservice.repositories;

import com.hyecheon.msscbeerorderservice.domain.Customer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hyecheon
 * @date 2020-01-29
 */
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

  List<Customer> findAllByCustomerNameLike(String customerName);

}
