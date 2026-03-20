package com.cristino.hexagonal.application.ports.out;

import com.cristino.hexagonal.application.core.domain.Customer;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
