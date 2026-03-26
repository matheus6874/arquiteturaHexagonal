package com.cristino.hexagonal.application.config;

import com.cristino.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.cristino.hexagonal.application.core.usercase.DeleteCustomerByIdUserCase;
import com.cristino.hexagonal.application.core.usercase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUserCase deleteCustomerByIdUserCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerByIdAdapter deleteCustomerByIdAdapter){
        return new DeleteCustomerByIdUserCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);
    }

}
