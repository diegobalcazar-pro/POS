package Principal;

import java.util.LinkedList;

public class Empresa {
	protected String nombreEmpresa;
	protected LinkedList <Sucursal> sucursales;
	
	//Constructor
	public Empresa(String nombreEmpresa, LinkedList<Sucursal> sucursales) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.sucursales = sucursales;
	}

	
	//getters y setters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public LinkedList<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(LinkedList<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}


	//metodos
	@Override
	public String toString() {
		return "Empresa [nombreEmpresa=" + nombreEmpresa + ", sucursales=" + sucursales + "]";
	}
	
	public void AgregarSucursal() {
		
	}
	
	

}
