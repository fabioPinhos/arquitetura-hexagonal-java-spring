package com.fabio.hexagonal.application.core.usecases;

import com.fabio.hexagonal.application.core.domain.Customer;
import com.fabio.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.fabio.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.fabio.hexagonal.application.ports.out.FindAddressByZipCodeOutPutPort;
import com.fabio.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

  private final FindCustomerByIdInputPort findCustomerByIdInputPort;

  private final FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort;

  private final UpdateCustomerOutputPort updateCustomerOutPutPorter;

  public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                               FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort,
                               UpdateCustomerOutputPort updateCustomerOutPutPorter) {
    this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    this.findAddressByZipCodeOutPutPort = findAddressByZipCodeOutPutPort;
    this.updateCustomerOutPutPorter = updateCustomerOutPutPorter;
  }

  @Override
  public void update(Customer customer, String zipCode){

    findCustomerByIdInputPort.find(customer.getId());
    var address = findAddressByZipCodeOutPutPort.find(zipCode);

    customer.setAddress(address);

    updateCustomerOutPutPorter.update(customer);
  }
}
