package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Pais;
import com.examen.service.PaisService;

@RestController
@RequestMapping("/api/rest/pais/")
public class PaisController {
	
	
	@Autowired
	private PaisService service;
	
	@GetMapping
	public ResponseEntity<List<Pais>> listar(){
		
		return ResponseEntity.ok(service.listaPais());
	}

}
