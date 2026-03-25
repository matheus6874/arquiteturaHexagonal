package com.cristino.hexagonal.application.core.usercase;

import com.cristino.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.cristino.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.cristino.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUserCase  implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUserCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }

}
