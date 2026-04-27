package BLL;

import javax.swing.JOptionPane;

public class Admin extends Cuenta{
	protected String idAdmin;

	
	//Constructor
	public Admin(String nombre, String apellido, String dni, String telefono, String mail, String usuario,
			String contrasena, String legajo, String rolCuenta, String idAdmin) {
		super(nombre, apellido, dni, telefono, mail, usuario, contrasena, legajo, rolCuenta);
		this.idAdmin = idAdmin;
	}


	//Getters y setters
	public String getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}


	//Metodos
	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + "]";
	}
	
	
	
	
	
	public void CrearUsuario() {
		
    }
	
	public void EliminarUsuario() {
		
    }
	
	public void AsignarRoles() {
		
    }
	
	public void VerHistorialDeVentas() {
		
    }
	
	public void VerMovimientoDeStock() {
		
    }
	
	public void VerTopDeVentas() {
		
    }
	
	public void ConfigurarDescuentos() {
		
    }
	
	public void ModificarNombreDeEmpresa() {
		
    }


	@Override
	public void menu() {
		// TODO Auto-generated method stub
		super.menu();
		System.out.println("Inicio de Sesion Administrador");
		JOptionPane.showMessageDialog(null, "Bienvenido Administrador " + this.getNombre());
	}
	
	
	
}
