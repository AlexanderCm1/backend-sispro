package pe.edu.upeu.sispro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sispro.entity.Plan;
import pe.edu.upeu.sispro.service.PlanService;

@RestController
public class PlanController {
	@Autowired
	private PlanService planService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/planes")
	public List<Plan> listarP(){
		return planService.listar();
	}
	
	
	/*
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public Map<String, Object> save(@RequestBody Plan plan){
		return planService.create(plan);
	}
	*/
	

}
