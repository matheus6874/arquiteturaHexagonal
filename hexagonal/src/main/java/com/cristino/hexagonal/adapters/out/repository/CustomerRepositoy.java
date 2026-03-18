package com.cristino.hexagonal.adapters.out.repository;

import com.cristino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepositoy extends MongoRepository<CustomerEntity,String> {
}
