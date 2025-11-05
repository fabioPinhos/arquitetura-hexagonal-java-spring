package com.fabio.hexagonal.application.ports.in;

import com.fabio.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

  Customer find(String id);
}
