package com.fabio.hexagonal.application.ports.out;

import com.fabio.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutPutPort {

  Address find(String zipCode);
}
