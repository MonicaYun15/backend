package com.microservice.celulares.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.microservice.celulares.entity.Celular;


public interface CelularService {

	public List<Celular> findAll();
	
	public Celular findById(Long id);
	
	public void deleteById(Long id);
	
	public Celular save (Celular instance);
	
	public boolean existsById (Long id);
	
}
