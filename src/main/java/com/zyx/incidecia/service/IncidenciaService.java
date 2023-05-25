package com.zyx.incidecia.service;

import java.util.Optional;

import com.zyx.incidecia.entity.Incidencia;

public interface IncidenciaService {
	
	 Optional<Incidencia> getIncidenciaById(Long id);
	
	Incidencia createIncidencia(Incidencia incidencia, Long idOperador);

}
