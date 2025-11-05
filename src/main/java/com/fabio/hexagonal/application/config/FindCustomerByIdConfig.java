package com.fabio.hexagonal.application.config;

import com.fabio.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.fabio.hexagonal.application.core.usecases.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

  @Bean
  public FindCustomerByIdUseCase findCustomerByIdUseCase(
      FindCustomerByIdAdapter findCustomerByIdAdapter){
    return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
  }

}
