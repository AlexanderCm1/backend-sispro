package pe.edu.upeu.sispro.entity;

public class Problematica {
	private int codigo_beneficiario;
	private String nombre;
	private String apellidos;
	private String problematica;
	private String fecha_publicacion;
	private String comunidad;
	
	
	
	
	public Problematica() {

	}
	public Problematica(int codigo_beneficiario, String nombre, String apellidos, String problematica,
			String fecha_publicacion, String comunidad) {
		super();
		this.codigo_beneficiario = codigo_beneficiario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.problematica = problematica;
		this.fecha_publicacion = fecha_publicacion;
		this.comunidad = comunidad;
	}
	public int getCodigo_beneficiario() {
		return codigo_beneficiario;
	}
	public void setCodigo_beneficiario(int codigo_beneficiario) {
		this.codigo_beneficiario = codigo_beneficiario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getProblematica() {
		return problematica;
	}
	public void setProblematica(String problematica) {
		this.problematica = problematica;
	}
	public String getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	
}
