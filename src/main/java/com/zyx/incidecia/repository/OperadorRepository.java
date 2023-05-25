package com.zyx.incidecia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyx.incidecia.entity.OperadorEntity;
@Repository
public interface OperadorRepository extends JpaRepository<OperadorEntity, Long> {

}
