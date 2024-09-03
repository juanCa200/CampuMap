package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Salones;
import com.api.repository.RepositorySalones;

@Service
public class ServiceSalonesImpl implements ServiceSalones {

	@Autowired
	RepositorySalones repositorio;
	
	@Override
	public List<Salones> buscarSalones() {
		return repositorio.findAll();
	}

}
