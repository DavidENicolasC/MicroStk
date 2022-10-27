package com.micro.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.micro.model.Ciudad;
import com.micro.repository.CiudadRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CiudadService {
	@Autowired
	private CiudadRepository ciudadRepository;
	
	public void save (Ciudad ciudad) {
		ciudadRepository.save(ciudad);
		
	}
	
	public List<Ciudad> findAll(){
		return ciudadRepository.findAll();
	}
	
	public Optional<Ciudad> findById(String id) {
		return ciudadRepository.findById(id);
	}
	
	public void deleteById(String id) {
		ciudadRepository.deleteById(id);
		
	}

}
