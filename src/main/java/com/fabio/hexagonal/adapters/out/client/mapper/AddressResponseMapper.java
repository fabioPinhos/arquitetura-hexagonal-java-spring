package com.fabio.hexagonal.adapters.out.client.mapper;

import com.fabio.hexagonal.adapters.out.client.response.AddressResponse;
import com.fabio.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

  Address toAddress(AddressResponse addressResponse);
}
