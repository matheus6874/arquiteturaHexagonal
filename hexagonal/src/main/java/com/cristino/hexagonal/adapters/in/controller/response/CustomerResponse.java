package com.cristino.hexagonal.adapters.in.controller.response;


import com.cristino.hexagonal.application.core.domain.Adress;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Adress adress;

    private String cpf;

    private Boolean isValidCpf;
}
