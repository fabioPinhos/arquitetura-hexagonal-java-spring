package com.fabio.hexagonal.application.core.usecases;

import com.fabio.hexagonal.application.core.domain.Customer;
import com.fabio.hexagonal.application.core.exceptions.ObjectNotFoundException;
import com.fabio.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.fabio.hexagonal.application.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

  private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

  public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort) {
    this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
  }

  @Override
  public Customer find(String id){
    return findCustomerByIdOutPutPort.find(id).orElseThrow(
        () -> new ObjectNotFoundException(id)
    );
  }
}
