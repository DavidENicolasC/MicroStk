package com.valhalla.microstk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.valhalla.microstk.commons.GenericRESTIMPL;
import com.valhalla.microstk.dao.api.RegistroRepo;
import com.valhalla.microstk.model.Registro;
import com.valhalla.microstk.service.api.RegistroAPI;

@Service
public class RegistroIMPL extends GenericRESTIMPL<Registro, Long> implements RegistroAPI {

	@Autowired
	private RegistroRepo registroDaoAPI;
	
	public RegistroRepo getDao() {
		return registroDaoAPI;
	}

}
