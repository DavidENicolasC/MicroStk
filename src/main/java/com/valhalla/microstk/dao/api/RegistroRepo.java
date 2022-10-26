package com.valhalla.microstk.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.valhalla.microstk.model.Registro;

public interface RegistroRepo extends MongoRepository <Registro, Long> {

}
