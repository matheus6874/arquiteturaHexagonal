package com.cristino.hexagonal.application.core.usercase;

import com.cristino.hexagonal.application.core.domain.Customer;
import com.cristino.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.cristino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cristino.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;



    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var adress = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        updateCustomerOutputPort.update(customer);
    }

}
