package Principal;

import java.util.LinkedList;

public class Caja {
	protected String idCaja;
	protected LinkedList <Empleado> empleados;
	
	
	//constructor
	public Caja(String idCaja, LinkedList<Empleado> empleados) {
		super();
		this.idCaja = idCaja;
		this.empleados = empleados;
	}


	//Getters y Setters
	public String getIdCaja() {
		return idCaja;
	}
	public void setIdCaja(String idCaja) {
		this.idCaja = idCaja;
	}


	public LinkedList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(LinkedList<Empleado> empleados) {
		this.empleados = empleados;
	}


	//metodos
	@Override
	public String toString() {
		return "Caja [idCaja=" + idCaja + ", empleados=" + empleados + "]";
	}
	
	
	
	
	
	
	
	

}
