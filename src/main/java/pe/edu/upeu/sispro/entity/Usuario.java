package pe.edu.upeu.sispro.entity;

public class Usuario {
	private int usuario_id;
	private String login;
	private String pass;
	private int persona_id;
	private int rol_id;
	public Usuario() {
	
		
	}
	public Usuario(int usuario_id, String login, String pass, int persona_id, int rol_id) {
		super();
		this.usuario_id = usuario_id;
		this.login = login;
		this.pass = pass;
		this.persona_id = persona_id;
		this.rol_id = rol_id;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public int getRol_id() {
		return rol_id;
	}
	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}
	
	

}


