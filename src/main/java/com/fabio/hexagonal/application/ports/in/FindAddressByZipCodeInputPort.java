package com.fabio.hexagonal.application.ports.in;

import com.fabio.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeInputPort {

  Address find(String zipCode);
}
