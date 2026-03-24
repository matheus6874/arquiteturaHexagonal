package com.cristino.hexagonal.application.ports.out;

import com.cristino.hexagonal.application.core.domain.Adress;

public interface FindAddressByZipCodeOutputPort {

    Adress find(String zipCode);
}
