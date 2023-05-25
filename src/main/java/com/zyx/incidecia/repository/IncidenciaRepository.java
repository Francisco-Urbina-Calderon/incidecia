package com.zyx.incidecia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyx.incidecia.entity.Incidencia;


@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {

}
