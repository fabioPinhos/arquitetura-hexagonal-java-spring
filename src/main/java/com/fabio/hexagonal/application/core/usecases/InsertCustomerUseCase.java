package com.fabio.hexagonal.application.core.usecases;

import com.fabio.hexagonal.application.core.domain.Customer;
import com.fabio.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.fabio.hexagonal.application.ports.out.FindAddressByZipCodeOutPutPort;
import com.fabio.hexagonal.application.ports.out.InsertCustomerOutPutPort;
import com.fabio.hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

  private final FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort;

  private final InsertCustomerOutPutPort insertCustomerOutPutPort;

  private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

  public InsertCustomerUseCase(FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort,
                               InsertCustomerOutPutPort insertCustomerOutPutPort,
                               SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
    this.findAddressByZipCodeOutPutPort = findAddressByZipCodeOutPutPort;
    this.insertCustomerOutPutPort = insertCustomerOutPutPort;
    this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
  }

  @Override
  public void insert(Customer customer, String zipCode) {
    var address = findAddressByZipCodeOutPutPort.find(zipCode);

    customer.setAddress(address);

    insertCustomerOutPutPort.insert(customer);
    sendCpfForValidationOutputPort.send(customer.getCpf());
  }

}
