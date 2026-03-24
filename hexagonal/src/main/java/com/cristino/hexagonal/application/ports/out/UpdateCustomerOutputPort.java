package com.cristino.hexagonal.application.ports.out;

import com.cristino.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
