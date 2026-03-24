package com.cristino.hexagonal.application.core.usercase;

import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cristino.hexagonal.application.ports.out.InsertCustomerOutputPort;


public class InsertCustomerUserCase implements InsertCustomerOutputPort{
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUserCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var adress = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        insertCustomerOutputPort.insert(customer);
    }

    @Override
    public void insert(Customer customer) {

    }
}
