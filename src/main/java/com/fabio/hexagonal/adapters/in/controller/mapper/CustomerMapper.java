package com.fabio.hexagonal.adapters.in.controller.mapper;

import com.fabio.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.fabio.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.fabio.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  @Mapping(target="id", ignore = true)
  @Mapping(target="address", ignore = true)
  Customer toCustomer(CustomerRequest customerRequest);

  CustomerResponse toCustomerResponse(Customer customer);
}
