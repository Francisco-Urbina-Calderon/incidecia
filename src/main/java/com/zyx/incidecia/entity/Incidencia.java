package com.zyx.incidecia.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="incidencia")
public class Incidencia {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name ="descripcion")
	private String descripcion;
	
	@Column(name ="fecha")
	private LocalDate fecha;
	@Column(name ="estado")
	private String esatdo;
	
	
	@ManyToOne
	@JoinColumn(name ="operador_id")
	private OperadorEntity operador;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getEsatdo() {
		return esatdo;
	}


	public void setEsatdo(String esatdo) {
		this.esatdo = esatdo;
	}


	public OperadorEntity getOperador() {
		return operador;
	}


	public void setOperador(OperadorEntity operador) {
		this.operador = operador;
	}
	
	
	
	

}
