package com.zyx.incidecia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zyx.incidecia.entity.Incidencia;
import com.zyx.incidecia.service.IncidenciaService;

@RestController
@RequestMapping("/api/incidencias")
public class InciadenciaController {
	
	
	
	@Autowired
	private IncidenciaService service;
	
	
	
	
	@GetMapping("{id}")
	public ResponseEntity<?> getIncidenciaById(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getIncidenciaById(id));
	}
	
	@PostMapping("/")
	public ResponseEntity<?>createIncidencia(@RequestBody Incidencia incidencia, @RequestParam("operadorId")Long operadorId){
		return ResponseEntity.ok(this.service.createIncidencia(incidencia, operadorId));
	}

}
