package com.cristino.hexagonal.application.ports.in;

import com.cristino.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
