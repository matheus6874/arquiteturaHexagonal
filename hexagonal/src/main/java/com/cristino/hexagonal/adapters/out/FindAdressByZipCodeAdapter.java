package com.cristino.hexagonal.adapters.out;

import com.cristino.hexagonal.adapters.out.client.FindAdressByZipCodeClient;
import com.cristino.hexagonal.adapters.out.client.mapper.AdressResponseMapper;
import com.cristino.hexagonal.application.core.domain.Adress;
import com.cristino.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAdressByZipCodeAdapter implements FindAdressByZipCodeOutputPort {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    @Autowired
    private AdressResponseMapper adressResponseMapper;

    @Override
    public Adress find(String zipCode) {
        var adressResponse = findAdressByZipCodeClient.find(zipCode);
        return adressResponseMapper.toAdress(adressResponse );
    }
}
