package pe.edu.upeu.sispro.entity;

public class Proyectos {
	private String lider;
	private String proyecto;
	private String temas;
	private String fechas;
	private String modalidad;
	
	
	
	public Proyectos() {

		
	}
	public Proyectos(String lider, String proyecto, String temas, String fechas, String modalidad) {
		super();
		this.lider = lider;
		this.proyecto = proyecto;
		this.temas = temas;
		this.fechas = fechas;
		this.modalidad = modalidad;
	}
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getTemas() {
		return temas;
	}
	public void setTemas(String temas) {
		this.temas = temas;
	}
	public String getFechas() {
		return fechas;
	}
	public void setFechas(String fechas) {
		this.fechas = fechas;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	

	
}
