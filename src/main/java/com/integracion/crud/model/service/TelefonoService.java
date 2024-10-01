package com.integracion.crud.model.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integracion.crud.model.entity.Telefono;
import com.integracion.crud.model.repository.TelefonoRepository;

@Service
@Transactional
public class TelefonoService {

	@Autowired
	TelefonoRepository rolRepository;

	public void save(Telefono telefono) {
		rolRepository.save(telefono);
	}

	List<Telefono> findByIdUsu(UUID idUser) {
		return rolRepository.findByIdUsu(idUser);
	}

	public void eliminar(Telefono telefono) {
		rolRepository.delete(telefono);
	}
}

