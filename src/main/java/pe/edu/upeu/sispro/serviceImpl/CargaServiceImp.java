package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.CargaDao;
import pe.edu.upeu.sispro.entity.Carga;
import pe.edu.upeu.sispro.service.CargaService;

@Service
public class CargaServiceImp implements CargaService{
	@Autowired
	private CargaDao cargaDao;

	@Override
	public List<Carga> listar() {
		// TODO Auto-generated method stub
		return cargaDao.listar();
	}

}
