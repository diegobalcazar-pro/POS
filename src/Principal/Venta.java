package Principal;

import java.util.LinkedList;

public class Venta {
	protected String idPedido;
	protected LinkedList <Producto> productos;
	protected LinkedList <Caja> cajas;
	protected Cliente clientes;
	
	
	//Constructor
	public Venta(String idPedido, LinkedList<Producto> productos, LinkedList<Caja> cajas,
			Cliente clientes) {
		super();
		this.idPedido = idPedido;
		this.productos = productos;
		this.cajas = cajas;
		this.clientes = clientes;
	}


	//Getters y setters
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}


	public LinkedList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}


	public LinkedList<Caja> getCajas() {
		return cajas;
	}
	public void setCajas(LinkedList<Caja> cajas) {
		this.cajas = cajas;
	}


	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}


	
	//Metodos
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", productos=" + productos + ", cajas=" + cajas + ", clientes="
				+ clientes + "]";
	}
	
	

}
