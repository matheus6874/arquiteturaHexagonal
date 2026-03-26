package com.cristino.hexagonal.application.config;

import com.cristino.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.cristino.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.cristino.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import com.cristino.hexagonal.application.core.usercase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);

    }
}
