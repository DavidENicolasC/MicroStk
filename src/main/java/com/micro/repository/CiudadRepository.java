package com.micro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.Ciudad;

@Repository
public interface CiudadRepository extends MongoRepository<Ciudad, String> {

}
