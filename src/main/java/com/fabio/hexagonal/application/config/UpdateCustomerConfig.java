package com.fabio.hexagonal.application.config;

import com.fabio.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.fabio.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.fabio.hexagonal.application.core.usecases.FindCustomerByIdUseCase;
import com.fabio.hexagonal.application.core.usecases.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

  @Bean
  public UpdateCustomerUseCase updateCustomerUseCase(
      FindCustomerByIdUseCase findCustomerByIdUseCase,
      FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
      UpdateCustomerAdapter updateCustomerAdapter
  ){
    return new UpdateCustomerUseCase(
        findCustomerByIdUseCase,
        findAddressByZipCodeAdapter,
        updateCustomerAdapter);
  }

}
