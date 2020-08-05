package pe.edu.upeu.sispro.entity;

public class Carga {
	private int carga_id;
	private String facultad;
	private String ep;
	private String carrera;
	private int codigo_docente;
	private String docente;
	private String curso;
	private String plan;
	private String semestre;
	public Carga() {

	}
	public Carga(int carga_id, String facultad, String ep, String carrera, int codigo_docente, String docente,
			String curso, String plan, String semestre) {
		super();
		this.carga_id = carga_id;
		this.facultad = facultad;
		this.ep = ep;
		this.carrera = carrera;
		this.codigo_docente = codigo_docente;
		this.docente = docente;
		this.curso = curso;
		this.plan = plan;
		this.semestre = semestre;
	}
	public int getCarga_id() {
		return carga_id;
	}
	public void setCarga_id(int carga_id) {
		this.carga_id = carga_id;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getEp() {
		return ep;
	}
	public void setEp(String ep) {
		this.ep = ep;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getCodigo_docente() {
		return codigo_docente;
	}
	public void setCodigo_docente(int codigo_docente) {
		this.codigo_docente = codigo_docente;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	

	
}


/*
CARGA_ID       NOT NULL NUMBER(6)    
FACULTAD       NOT NULL VARCHAR2(25) 
EP             NOT NULL VARCHAR2(25) 
CARRERA        NOT NULL VARCHAR2(25) 
CODIGO_DOCENTE          NUMBER(9)    
docente                 VARCHAR2(56) 
Curso          NOT NULL VARCHAR2(25) 
plan           NOT NULL VARCHAR2(15) 
semestre       NOT NULL VARCHAR2(15)
 * 
 */
