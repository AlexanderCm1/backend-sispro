package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.CargaDao;
import pe.edu.upeu.sispro.entity.Carga;


@Repository
public class CargaDaoImp implements CargaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Carga> listar() {
		String sql="select * from v_carga";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Carga.class));
	}

}
