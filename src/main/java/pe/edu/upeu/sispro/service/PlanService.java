package pe.edu.upeu.sispro.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sispro.entity.Plan;

public interface PlanService {

	List<Plan> listar();
	Map<String, Object> create(Plan plan);

	
}
