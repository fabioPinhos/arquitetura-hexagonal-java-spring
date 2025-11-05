package com.fabio.hexagonal.application.ports.out;

import com.fabio.hexagonal.application.core.domain.Customer;
import java.util.Optional;

public interface FindCustomerByIdOutPutPort {

  Optional<Customer> find(String id);

}
