package com.fabio.hexagonal.adapters.out;

import com.fabio.hexagonal.adapters.out.repository.CustomerRepository;
import com.fabio.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.fabio.hexagonal.application.core.domain.Customer;
import com.fabio.hexagonal.application.ports.out.FindCustomerByIdOutPutPort;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutPutPort {

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private CustomerEntityMapper customerEntityMapper;


  @Override
  public Optional<Customer> find(String id) {
    var customerEntity = customerRepository.findById(id);
    return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
  }
}
