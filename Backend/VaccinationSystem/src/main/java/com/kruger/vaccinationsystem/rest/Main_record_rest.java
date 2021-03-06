package com.kruger.vaccinationsystem.rest;

import com.kruger.vaccinationsystem.model.Main_record;
import com.kruger.vaccinationsystem.service.Main_record_service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/main/")
public class Main_record_rest {
	
	@Autowired
    private Main_record_service main_record_service;
    
    @GetMapping
    private ResponseEntity<List<Main_record>> getAll_main_record (){
    	return ResponseEntity.ok(main_record_service.findAll());
    }
    
    //GUARDO EL ADMINISTRADOR EN LA BASE DE DATOS
    public static void addAdmin(String[] args) throws Exception{
    	
    }
    
    //RECIVO LAS VARIABLES POST DE LOS DATOS DEL FORMULARIO PARA EL REGISTRO EN LA DB
    @PostMapping
    private ResponseEntity<Main_record> saveRecord (@RequestBody Main_record form_record){//pido la variable Post obligadamente
    	try {
    		Main_record recordGuardado = main_record_service.save(form_record);
        	return ResponseEntity.created(new URI("/main/"+ recordGuardado.getId())).body(recordGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
    }
}
