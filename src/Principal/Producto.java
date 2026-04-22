package Principal;

import java.util.LinkedList;

public class Producto {

	//atriubtos
	protected String nombreProducto;
	protected String descripcionProducto;
	protected double precio;
	protected LinkedList <Proveedor> proveedores;
	
	
	//constructores
	public Producto(String nombreProducto, String descripcionProducto, double precio,
			LinkedList<Proveedor> proveedores) {
		super();
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
		this.precio = precio;
		this.proveedores = proveedores;
	}


	//Getters y setters
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public LinkedList<Proveedor> getProveedores() {
		return proveedores;
	}
	public void setProveedores(LinkedList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}


	
	//Metodos
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto
				+ ", precio=" + precio + ", proveedores=" + proveedores + "]";
	}
	
	
	
}
