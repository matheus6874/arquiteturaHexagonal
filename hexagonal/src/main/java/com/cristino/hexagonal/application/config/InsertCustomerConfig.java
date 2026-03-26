package com.cristino.hexagonal.application.config;

import com.cristino.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.cristino.hexagonal.adapters.out.InsertCustomerAdapter;
import com.cristino.hexagonal.application.core.usercase.InsertCustomerUserCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUserCase insertCustomerUserCase(  FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
    InsertCustomerAdapter insertCustomerAdapter){
        return new InsertCustomerUserCase(findAddressByZipCodeAdapter,insertCustomerAdapter);
    }

}
