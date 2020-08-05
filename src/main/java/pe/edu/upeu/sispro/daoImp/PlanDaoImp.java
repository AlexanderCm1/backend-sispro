package pe.edu.upeu.sispro.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sispro.dao.PlanDao;
import pe.edu.upeu.sispro.entity.Plan;



@Repository
public class PlanDaoImp implements PlanDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;

	
	@Override
	public List<Plan> listar() {
		String sql = "select * from plan_proyectos";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Plan.class));
	}


	@Override
	public Map<String, Object> create(Plan plan) {
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("p_insertar_plan").declareParameters(
				new SqlParameter("p_info",Types.INTEGER),
				new SqlParameter("p_carga_id",Types.INTEGER),
				new SqlParameter("p_nombre",Types.VARCHAR),
				new SqlParameter("p_presupuesto",Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_info", plan.getInfo_comunidad_id())
															.addValue("p_carga_id", plan.getCarga_id())
															.addValue("p_nombre", plan.getNombre())
															.addValue("p_presupuesto", plan.getPresupuesto());
		
		return simplejdbcCall.execute(in);
		
	}



		



}
