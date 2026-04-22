package Principal;

import java.util.LinkedList;

public class Caja {
	protected String idCaja;
	protected LinkedList <Empleado> Empleados;
	
	
	//constructor
	public Caja(String idCaja, LinkedList <Empleado> empleados) {
		super();
		this.idCaja = idCaja;
		Empleados = empleados;
	}


	//getters y setters
	public String getIdCaja() {
		return idCaja;
	}
	public void setIdCaja(String idCaja) {
		this.idCaja = idCaja;
	}


	public LinkedList <Empleado> getEmpleado() {
		return Empleados;
	}
	public void setEmpleado(LinkedList <Empleado> empleados) {
		Empleados = empleados;
	}


	
	//metodos
	@Override
	public String toString() {
		return "Caja [idCaja=" + idCaja + ", Empleado=" + Empleados + "]";
	}
	
	
	
	

}
