package com.cristino.hexagonal.application.ports.out;

import com.cristino.hexagonal.application.core.domain.Adress;

public interface FindAdressByZipCodeOutputPort {

    Adress find(String zipCode);
}
