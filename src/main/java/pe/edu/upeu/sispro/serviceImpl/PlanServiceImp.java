package pe.edu.upeu.sispro.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sispro.dao.PlanDao;
import pe.edu.upeu.sispro.entity.Plan;
import pe.edu.upeu.sispro.service.PlanService;


@Service
public class PlanServiceImp implements PlanService{

	@Autowired
	private PlanDao planDao;
	
	@Override
	public List<Plan> listar() {
		// TODO Auto-generated method stub
		return planDao.listar();
	}

	@Override
	public Map<String, Object> create(Plan plan) {
		return planDao.create(plan);
	}



}
