package com.fabio.hexagonal.application.config;

import com.fabio.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.fabio.hexagonal.application.core.usecases.InsertCustomerUseCase;
import com.fabio.hexagonal.application.ports.out.FindAddressByZipCodeOutPutPort;
import com.fabio.hexagonal.application.ports.out.InsertCustomerOutPutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

  @Bean
  public InsertCustomerUseCase insertCustomerUseCase(
      FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort,
      InsertCustomerOutPutPort insertCustomerOutPutPort,
      SendCpfValidationAdapter sendCpfValidationAdapter
  ){
    return new InsertCustomerUseCase(findAddressByZipCodeOutPutPort, insertCustomerOutPutPort, sendCpfValidationAdapter);
  }


}
