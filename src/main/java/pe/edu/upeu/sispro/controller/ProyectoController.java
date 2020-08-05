package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Proyectos;
import pe.edu.upeu.sispro.service.ProyectoService;

@RestController
public class ProyectoController {
	
	@Autowired
	private ProyectoService proyectoService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/proyectos")
	public List<Proyectos> listarP(){
		return proyectoService.listar();
	}

}
