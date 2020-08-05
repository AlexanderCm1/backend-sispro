package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Persona;
import pe.edu.upeu.sispro.service.PersonaService;

@RestController
public class PersonaController {

	
	@Autowired
	private PersonaService personaService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/persona")
	public List<Persona> listarP(){
		return personaService.listar();
	}
	
}
