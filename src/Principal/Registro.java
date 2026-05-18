package Principal;

import java.time.LocalDate;
import java.util.LinkedList;

public class Registro {

	//atributos
	protected String idRegistro;
	protected LinkedList <Venta> ventas;
	protected LinkedList <Producto> productos;
	protected LinkedList <MedioDePago> medioDePagos;
	protected LinkedList <Cliente> clientes;
	protected LinkedList <Cuenta> cuentas;
	protected LocalDate fecha;
	
	
	//Constructor
	public Registro(String idRegistro, LinkedList<Venta> ventas, LinkedList<Producto> productos,
			LinkedList<MedioDePago> medioDePagos, LinkedList<Cliente> clientes, LinkedList<Cuenta> cuentas) {
		super();
		this.idRegistro = idRegistro;
		this.ventas = ventas;
		this.productos = productos;
		this.medioDePagos = medioDePagos;
		this.clientes = clientes;
		this.cuentas = cuentas;
	}


	
	//Getters y setters
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}


	public LinkedList<Venta> getPedidos() {
		return ventas;
	}
	public void setPedidos(LinkedList<Venta> pedidos) {
		this.ventas = pedidos;
	}


	public LinkedList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}


	public LinkedList<MedioDePago> getMedioDePagos() {
		return medioDePagos;
	}
	public void setMedioDePagos(LinkedList<MedioDePago> medioDePagos) {
		this.medioDePagos = medioDePagos;
	}


	public LinkedList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}


	public LinkedList<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(LinkedList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}



	//Metodos
	@Override
	public String toString() {
		return "Registro [idRegistro=" + idRegistro + ", ventas=" + ventas + ", productos=" + productos
				+ ", medioDePagos=" + medioDePagos + ", clientes=" + clientes + ", cuentas=" + cuentas + "]";
	}
	
	
	
	
}
