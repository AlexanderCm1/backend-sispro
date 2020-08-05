package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.PersonaDao;
import pe.edu.upeu.sispro.entity.Persona;
import pe.edu.upeu.sispro.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaDao.listar();
	}
	
}
