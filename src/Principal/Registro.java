package Principal;

import java.util.LinkedList;

public class Registro {

	
	//atributos
	private String idRegistro;
	private LinkedList Pedidos;
	private LinkedList Productos;
	private LinkedList TipoDePagos;
	private LinkedList Clientes;
	private LinkedList Cuentas;
	//constructor
	public Registro(String idRegistro, LinkedList pedidos, LinkedList productos, LinkedList tipoDePagos,
			LinkedList clientes, LinkedList cuentas) {
		super();
		this.idRegistro = idRegistro;
		Pedidos = pedidos;
		Productos = productos;
		TipoDePagos = tipoDePagos;
		Clientes = clientes;
		Cuentas = cuentas;
	}
	//getters&setters
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public LinkedList getPedidos() {
		return Pedidos;
	}
	public void setPedidos(LinkedList pedidos) {
		Pedidos = pedidos;
	}
	public LinkedList getProductos() {
		return Productos;
	}
	public void setProductos(LinkedList productos) {
		Productos = productos;
	}
	public LinkedList getTipoDePagos() {
		return TipoDePagos;
	}
	public void setTipoDePagos(LinkedList tipoDePagos) {
		TipoDePagos = tipoDePagos;
	}
	public LinkedList getClientes() {
		return Clientes;
	}
	public void setClientes(LinkedList clientes) {
		Clientes = clientes;
	}
	public LinkedList getCuentas() {
		return Cuentas;
	}
	public void setCuentas(LinkedList cuentas) {
		Cuentas = cuentas;
	}
	
	
}
