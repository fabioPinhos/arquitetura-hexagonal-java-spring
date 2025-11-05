package com.fabio.hexagonal.adapters.out;

import com.fabio.hexagonal.adapters.out.repository.CustomerRepository;
import com.fabio.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

  @Autowired
  CustomerRepository customerRepository;

  @Override
  public void delete(String id) {
    customerRepository.deleteById(id);
  }
}
