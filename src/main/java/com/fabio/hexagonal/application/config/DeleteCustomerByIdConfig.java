package com.fabio.hexagonal.application.config;

import com.fabio.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.fabio.hexagonal.application.core.usecases.DeleteCustomerByIdUseCase;
import com.fabio.hexagonal.application.core.usecases.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

  @Bean
  public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
      FindCustomerByIdUseCase findCustomerByIdUseCase,
      DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
  ){
    return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
  }

}
