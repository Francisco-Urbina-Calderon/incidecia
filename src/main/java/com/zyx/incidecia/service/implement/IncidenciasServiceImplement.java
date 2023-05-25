package com.zyx.incidecia.service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyx.incidecia.entity.Incidencia;
import com.zyx.incidecia.entity.OperadorEntity;
import com.zyx.incidecia.repository.IncidenciaRepository;
import com.zyx.incidecia.repository.OperadorRepository;
import com.zyx.incidecia.service.IncidenciaService;
@Service
public class IncidenciasServiceImplement implements IncidenciaService{
	
	
	
	@Autowired
	private IncidenciaRepository repo;
	
	
	@Autowired
	private OperadorRepository repoO;

	@Override
	public Optional<Incidencia> getIncidenciaById(Long id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id);
	}

	@Override
	public Incidencia createIncidencia(Incidencia incidencia, Long idOperador) {
		// TODO Auto-generated method stub
		Optional<OperadorEntity> opd= this.repoO.findById(idOperador);
		
		OperadorEntity operador = new OperadorEntity();
		operador.setId(idOperador);
		operador.setNombre(opd.get().getNombre());
		operador.setApellido(opd.get().getApellido());
		operador.setEmail(opd.get().getEmail());
		incidencia.setOperador(operador);
		return this.repo.save(incidencia);
	}

}
