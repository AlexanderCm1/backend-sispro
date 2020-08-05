package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.RolDao;
import pe.edu.upeu.sispro.entity.Rol;
import pe.edu.upeu.sispro.service.RolService;

@Service
public class RolServiceImp implements RolService{

	@Autowired
	private RolDao rolDao;
	
	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return rolDao.listar();
	}

}
