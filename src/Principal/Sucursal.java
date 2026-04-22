package Principal;

import java.util.LinkedList;

public class Sucursal {
	protected String idSucursal;
	protected LinkedList <Caja> cajas;
	
	
	//constructor
	public Sucursal(String idSucursal, LinkedList<Caja> cajas) {
		super();
		this.idSucursal = idSucursal;
		this.cajas = cajas;
	}


	//getters y setters
	public String getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
	}

	
	public LinkedList<Caja> getCajas() {
		return cajas;
	}
	public void setCajas(LinkedList<Caja> cajas) {
		this.cajas = cajas;
	}


	//metodos
	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", cajas=" + cajas + "]";
	}
	
	public void AgregarCaja() {
		
	}
	
	
}
