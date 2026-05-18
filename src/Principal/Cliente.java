package Principal;

public class Cliente extends Persona{
	protected String direccion;
	protected String localidad;
	protected String tipo;
	
	
	//Constructor
	public Cliente(String nombre, String apellido, String dni, String telefono, String mail, String direccion,
			String localidad, String tipo) {
		super(nombre, apellido, dni, telefono, mail);
		this.direccion = direccion;
		this.localidad = localidad;
		this.tipo = tipo;
	}
	//Getters y setters
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//to string
	@Override
	public String toString() {
	    return nombre + " " + apellido + " - DNI: " + dni;
	}
	
	
	

}
