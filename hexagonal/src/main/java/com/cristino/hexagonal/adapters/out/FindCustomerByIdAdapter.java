package com.cristino.hexagonal.adapters.out;

import com.cristino.hexagonal.adapters.out.repository.CustomerRepositoy;
import com.cristino.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepositoy customerRepositoy;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepositoy.findById(id);

        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
