package com.fabio.hexagonal.adapters.out.repository.mapper;

import com.fabio.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.fabio.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

  CustomerEntity toCustomerEntity(Customer customer);

  Customer toCustomer(CustomerEntity customerEntity);
}
