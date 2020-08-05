package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.UsuarioDao;
import pe.edu.upeu.sispro.entity.Usuario;
import pe.edu.upeu.sispro.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> listar() {
		
		return usuarioDao.listar();
	}

}
