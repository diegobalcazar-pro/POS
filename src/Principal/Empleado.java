package Principal;

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
	public static Cuenta Login(String usuario, String pass) {


	    return null;
	}


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

}
