package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.RolDao;
import pe.edu.upeu.sispro.entity.Rol;


@Repository
public class RolDaoImp implements RolDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Rol> listar() {

		String sql = "select * from rol";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Rol.class));
	}

}
