package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.ProblematicaDao;
import pe.edu.upeu.sispro.entity.Problematica;

@Repository
public class ProblematicaDaoImp implements ProblematicaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Problematica> listar() {
		String sql ="select * from v_problematica_lista";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Problematica.class));
	}

}
