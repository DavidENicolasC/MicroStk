package com.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.Ciudad;
import com.micro.service.CiudadService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CiudadController {
	
	@Autowired
	private CiudadService ciudadService;
	
	@PostMapping("/ciudades")
	public void save(@RequestBody Ciudad ciudad) {
		ciudadService.save(ciudad);
		
	}
	
	@GetMapping("/ciudades")
	public List<Ciudad> finAll(){
		return ciudadService.findAll();
		
	}
	
	@GetMapping("/ciudad/{id}")
	public Ciudad findById(@PathVariable String id) {
		return ciudadService.findById(id).get();
		
	}
	
	@DeleteMapping("/ciudad/{id}")
	public void deleteById(@PathVariable String id) {
		ciudadService.deleteById(id);
		
	}
	
	@PutMapping("/ciudades")
	public void update(@RequestBody Ciudad ciudad) {
		ciudadService.save(ciudad);
		
	}

}
