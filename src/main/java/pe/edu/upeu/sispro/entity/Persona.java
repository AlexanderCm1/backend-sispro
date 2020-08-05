package pe.edu.upeu.sispro.entity;

public class Persona {
	
	
	private int persona_id;
	private String nombre;
	private String apellidos;
	private int dni;
	private String correo;
	public Persona() {

	
	}
	public Persona(int persona_id, String nombre, String apellidos, int dni, String correo) {
		super();
		this.persona_id = persona_id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	

}
