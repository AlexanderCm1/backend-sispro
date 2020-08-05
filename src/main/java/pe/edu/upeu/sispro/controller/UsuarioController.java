package pe.edu.upeu.sispro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Usuario;
import pe.edu.upeu.sispro.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/usuario")
	public List<Usuario> listarP(){
		return usuarioService.listar();
	}

}
