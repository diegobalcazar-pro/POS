package BLL;

import javax.swing.JOptionPane;

public class Empleado extends Cuenta{
	protected String idEmpleado;
	protected String rolEmpleado;
	
	
	//Constructor
	public Empleado(String nombre, String apellido, String dni, String telefono, String mail, String usuario,
			String contrasena, String legajo, String rolCuenta, String idEmpleado, String rolEmpleado) {
		super(nombre, apellido, dni, telefono, mail, usuario, contrasena, legajo, rolCuenta);
		this.idEmpleado = idEmpleado;
		this.rolEmpleado = rolEmpleado;
	}

	public Empleado(String nombre, String apellido, String mail, 
			String contrasena, String rolCuenta, int idEmpleado) {
		super(nombre, apellido, "", "", mail, "", contrasena, "", rolCuenta);
		this.idEmpleado = Integer.toString(idEmpleado);
		this.rolEmpleado = rolEmpleado;
	}
	//Getters y setters
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getRolEmpleado() {
		return rolEmpleado;
	}
	public void setRolEmpleado(String rolEmpleado) {
		this.rolEmpleado = rolEmpleado;
	}


	//Metodos
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", rolEmpleado=" + rolEmpleado + "]";
	}
	
	
	
	//Metodos Rol Cajero
	public void AbrirCaja() {		
	}
	
    public void GenerarVenta() {		
	}
    
    public void AplicarDescuentos() {		
	}
    
    public void IniciarProcesoDeEnvio() {		
	}

    public void GenerarTicket() {	
    }

    public void VerStock() {    	
    }
    
    public void VerVentasDelDia() {    	
    }
    
    public void CierreDeCaja() {    	
    }
	
	
    //Metedos Rol Deposito
    public void CargarProducto() {
    }
    
    public void ModificarProducto() {    	
    }
    
    public void EliminarProducto() {    	
    }
    
    public void MoverProducto() {    	
    }
    
    public void VerPedidos() {    	
    }
    
    public void CuposDePedidos() {    	
    }
    
    public void EnviarPedido() {    	
    }
    
    public void EnviarFaltantesDeProducto() {    	
    }


	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
		
    if (this.rolEmpleado=="Caja") {
			
			System.out.println("Inicio de Sesion Caja");
			JOptionPane.showMessageDialog(null, "Bienvenido Empleado " + this.getNombre());
			
			
		} else if (this.rolEmpleado=="Deposito"){

			System.out.println("Inicio de Sesion Deposito");
			JOptionPane.showMessageDialog(null, "Bienvenido Empleado " + this.getNombre());
			
		}
    super.menu();
	}
	

}