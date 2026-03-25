package com.cristino.hexagonal.adapters.out;

import com.cristino.hexagonal.adapters.out.repository.CustomerRepositoy;
import com.cristino.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepositoy customerRepositoy;

    @Override
    public void delete(String id) {
        customerRepositoy.deleteById(id);
    }
}
