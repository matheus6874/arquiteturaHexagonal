package com.cristino.hexagonal.application.core.usercase;

import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import com.cristino.hexagonal.application.ports.out.InsertCustomerOutputPort;


public class InsertCustomerUserCase {
    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUserCase(FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var adress = findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        insertCustomerOutputPort.insert(customer);
    }
}
