package Principal;

import java.util.LinkedList;

public class Producto {

	//atriubtos
	
	private String nombreProducto;
	private String descripcion;
	private double precio;
	private LinkedList Proveedores;
	
	//constructores
	public Producto(String nombreProducto, String descripcion, double precio, LinkedList proveedores) {
		super();
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		Proveedores = proveedores;
	}
	
	//getters & setters
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public LinkedList getProveedores() {
		return Proveedores;
	}
	public void setProveedores(LinkedList proveedores) {
		Proveedores = proveedores;
	}
	
	
}
