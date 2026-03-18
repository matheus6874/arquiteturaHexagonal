package com.cristino.hexagonal.adapters.out.client.mapper;

import com.cristino.hexagonal.adapters.out.client.response.AddressResponse;
import com.cristino.hexagonal.application.core.domain.Adress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdressResponseMapper {
    Adress toAdress(AddressResponse addressResponse);
}
