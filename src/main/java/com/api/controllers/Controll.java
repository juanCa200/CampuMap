package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.api.entity.Salones;
import com.api.repository.RepositoryUsuario;
import com.api.service.ServiceSalonesImpl;

@Controller
public class Controll{

	@Autowired
	public ServiceSalonesImpl service;
	
	@Autowired
	public RepositoryUsuario usuarios;
	
	
	@GetMapping
	public String MostrarVist(Model modelo) {
		List<Salones> salones = service.buscarSalones();
		modelo.addAttribute("salones", salones);
		return "index";
	}


	@GetMapping("/login")
	public String Mostrarlogin() {
		return "login";
	}
	
	
	@GetMapping("/evento")
	public String MostrarEventos(Model modelo) {
		List<Salones> salones = service.buscarSalones();
		modelo.addAttribute("salones", salones);
		return "evento";
	}
	
	@GetMapping("/naturaleza")
	public String MostrarNaturaleza(Model modelo) {
		List<Salones> salones = service.buscarSalones();
		modelo.addAttribute("salones", salones);
		return "naturaleza";
	}
	
	@GetMapping("/notificaciones")
	public String MostrarNotificacion(Model modelo) {
		List<Salones> salones = service.buscarSalones();
		modelo.addAttribute("salones", salones);
		return "notificaciones";
	}
	
	
}
