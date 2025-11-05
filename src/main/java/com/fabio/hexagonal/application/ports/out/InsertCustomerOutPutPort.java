package com.fabio.hexagonal.application.ports.out;

import com.fabio.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutPutPort {

  void insert(Customer customer);
}
