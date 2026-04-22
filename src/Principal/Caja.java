package Principal;

import java.util.LinkedList;

public class Caja {
	protected String idCaja;
	protected LinkedList Empleado;
	
	
	//constructor
	public Caja(String idCaja, LinkedList empleado) {
		super();
		this.idCaja = idCaja;
		Empleado = empleado;
	}


	//getters y setters
	public String getIdCaja() {
		return idCaja;
	}
	public void setIdCaja(String idCaja) {
		this.idCaja = idCaja;
	}


	public LinkedList getEmpleado() {
		return Empleado;
	}
	public void setEmpleado(LinkedList empleado) {
		Empleado = empleado;
	}


	
	//metodos
	@Override
	public String toString() {
		return "Caja [idCaja=" + idCaja + ", Empleado=" + Empleado + "]";
	}
	
	
	
	

}
