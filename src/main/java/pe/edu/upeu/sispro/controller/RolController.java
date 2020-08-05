package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Rol;
import pe.edu.upeu.sispro.service.RolService;

@RestController
public class RolController {
	@Autowired
	private RolService rolService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/rol")
	public List<Rol> listarP(){
		return rolService.listar();
	}

}
