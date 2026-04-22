package Principal;

import java.util.LinkedList;

public class Inventario {
	protected int cantidad;
	protected LinkedList <Producto> productos;
	
	
	//Constructor
	public Inventario(int cantidad, LinkedList<Producto> productos) {
		super();
		this.cantidad = cantidad;
		this.productos = productos;
	}


	//Getters y setters
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public LinkedList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}


	
	//Metodos
	@Override
	public String toString() {
		return "Inventario [cantidad=" + cantidad + ", productos=" + productos + "]";
	}
	


}
