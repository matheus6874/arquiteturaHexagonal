package com.cristino.hexagonal.application.config;

import com.cristino.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.cristino.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
