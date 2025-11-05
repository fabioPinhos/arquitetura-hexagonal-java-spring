package com.fabio.hexagonal.adapters.in.controller.response;

import com.fabio.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

  private String name;
  private String cpf;
  private Address address;
  private Boolean isValidCpf;
}
