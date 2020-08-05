package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Problematica;
import pe.edu.upeu.sispro.service.ProblematicaService;


@RestController
public class ProblematicaController {
	@Autowired
	private ProblematicaService problematicaService;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/problematica")
	public List<Problematica> listarP(){
		return problematicaService.listar();
	}
	
	
	

}
