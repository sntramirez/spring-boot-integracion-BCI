package com.integracion.crud.model.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.integracion.crud.model.entity.Telefono;

@Repository
public interface TelefonoRepository extends JpaRepository<Telefono, Integer> {
	
	@Query("select t from Telefono t where t.idUser =?1")
	public List<Telefono> findByIdUsu(UUID idUser);
}
