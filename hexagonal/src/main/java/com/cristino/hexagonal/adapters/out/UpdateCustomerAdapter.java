package com.cristino.hexagonal.adapters.out;

import com.cristino.hexagonal.adapters.out.repository.CustomerRepositoy;
import com.cristino.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepositoy customerRepositoy;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepositoy.save(customerEntity);
    }
}
