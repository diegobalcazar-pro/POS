package Principal;

public class Cuenta extends Persona{
	protected String usuario;
	protected String contrasena;
	protected String legajo;
	protected String rolCuenta;
	
	
	//Constructor
	public Cuenta(String nombre, String apellido, String dni, String telefono, String mail, String usuario,
			String contrasena, String legajo, String rolCuenta) {
		super(nombre, apellido, dni, telefono, mail);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.legajo = legajo;
		this.rolCuenta = rolCuenta;
	}


	//Getters y setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public String getRolCuenta() {
		return rolCuenta;
	}
	public void setRolCuenta(String rolCuenta) {
		this.rolCuenta = rolCuenta;
	}


	//metodos
	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", contrasena=" + contrasena + ", legajo=" + legajo + ", rolCuenta="
				+ rolCuenta + "]";
	}
	
	public static Cuenta Login(String cuenta, String contrasena) {
		return null;
		
		
		
	}


	

}
