package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.PersonaDao;
import pe.edu.upeu.sispro.entity.Persona;

@Repository
public class PersonaDaoImp  implements PersonaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		String sql = "select * from persona";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Persona.class));
	}

}
