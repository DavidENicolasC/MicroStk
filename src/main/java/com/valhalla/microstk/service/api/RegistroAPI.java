package com.valhalla.microstk.service.api;

import com.valhalla.microstk.commons.GenericRESTAPI;
import com.valhalla.microstk.model.Registro;

public interface RegistroAPI extends GenericRESTAPI<Registro, Long> {

	Object getAll();

}
