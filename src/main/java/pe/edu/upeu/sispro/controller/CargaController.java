package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Carga;
import pe.edu.upeu.sispro.service.CargaService;

@RestController
public class CargaController {
	
	@Autowired
	private CargaService cargaService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/carga")
	public List<Carga> listarC(){
		return cargaService.listar();
	}

}
