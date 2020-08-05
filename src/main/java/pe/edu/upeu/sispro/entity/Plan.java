package pe.edu.upeu.sispro.entity;

public class Plan {
	private int plan_proyecto_id;
	private int info_comunidad_id;
	private int carga_id;
	private String nombre;
	private int presupuesto;
	public Plan() {

	}
	public Plan(int plan_proyecto_id, int info_comunidad_id, int carga_id, String nombre, int presupuesto) {
		super();
		this.plan_proyecto_id = plan_proyecto_id;
		this.info_comunidad_id = info_comunidad_id;
		this.carga_id = carga_id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}
	public int getPlan_proyecto_id() {
		return plan_proyecto_id;
	}
	public void setPlan_proyecto_id(int plan_proyecto_id) {
		this.plan_proyecto_id = plan_proyecto_id;
	}
	public int getInfo_comunidad_id() {
		return info_comunidad_id;
	}
	public void setInfo_comunidad_id(int info_comunidad_id) {
		this.info_comunidad_id = info_comunidad_id;
	}
	public int getCarga_id() {
		return carga_id;
	}
	public void setCarga_id(int carga_id) {
		this.carga_id = carga_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}


}


/*
PLAN_PROYECTO_ID  NOT NULL NUMBER(6)    
INFO_COMUNIDAD_ID          NUMBER(6)    
CARGA_ID                   NUMBER(6)    
NOMBRE                     VARCHAR2(45) 
PRESUPUESTO                NUMBER     */