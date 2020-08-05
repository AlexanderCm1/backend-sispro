package pe.edu.upeu.sispro.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.UsuarioDao;
import pe.edu.upeu.sispro.entity.Usuario;


@Repository
public class UsuarioDaoImp implements UsuarioDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public List<Usuario> listar() {
		String sql = "select * from usuario";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Usuario.class));
	}

}
