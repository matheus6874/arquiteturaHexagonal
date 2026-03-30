package com.cristino.hexagonal.application.core.usercase;

import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.cristino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cristino.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.cristino.hexagonal.application.ports.out.SendCpfForValidationOutputPort;


public class InsertCustomerUserCase implements InsertCustomerInputPort {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUserCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var adress = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());

    }

}
