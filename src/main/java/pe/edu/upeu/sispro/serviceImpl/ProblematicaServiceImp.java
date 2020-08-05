package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.ProblematicaDao;
import pe.edu.upeu.sispro.entity.Problematica;
import pe.edu.upeu.sispro.service.ProblematicaService;

@Service
public class ProblematicaServiceImp implements ProblematicaService{
	@Autowired
	private ProblematicaDao problematicaDao;
	
	@Override
	public List<Problematica> listar() {
		// TODO Auto-generated method stub
		return problematicaDao.listar();
	}

}
