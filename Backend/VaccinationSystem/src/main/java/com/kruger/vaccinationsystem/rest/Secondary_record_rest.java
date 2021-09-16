package com.kruger.vaccinationsystem.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kruger.vaccinationsystem.model.Secondary_record;
import com.kruger.vaccinationsystem.service.Secondary_record_service;

@RestController
@RequestMapping ("/secondary/")
public class Secondary_record_rest {
	@Autowired
	private Secondary_record_service secondary_record_service;
	
	@GetMapping
	private ResponseEntity<List<Secondary_record>> getAll_secondary_record(){
		return ResponseEntity.ok(secondary_record_service.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Secondary_record>> getById_secondary_record (@PathVariable ("id") Long id) {
		return ResponseEntity.ok(secondary_record_service.findById(id));
	}
}
