package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.ProyectosDao;
import pe.edu.upeu.sispro.entity.Proyectos;

@Repository
public class ProyectoDaoImp implements ProyectosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Proyectos> listar() {
		String sql ="SELECT * FROM V_PROYECTOS";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Proyectos.class));
	}
	
}
