package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.ProyectosDao;
import pe.edu.upeu.sispro.entity.Proyectos;
import pe.edu.upeu.sispro.service.ProyectoService;

@Service
public class ProyectoServiceImp implements ProyectoService{

	@Autowired
	private ProyectosDao proyectosDao;
	
	@Override
	public List<Proyectos> listar() {
		// TODO Auto-generated method stub
		return proyectosDao.listar();
	}
	
}
