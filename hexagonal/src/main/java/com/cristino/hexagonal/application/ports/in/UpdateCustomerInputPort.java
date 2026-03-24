package com.cristino.hexagonal.application.ports.in;

import com.cristino.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
