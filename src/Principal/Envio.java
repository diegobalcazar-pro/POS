package Principal;

import java.util.LinkedList;

public class Envio {

	//atributos
	protected String estadoDeEnvio;
	protected LinkedList <Venta> ventas;
	protected LinkedList <Cliente> clientes;
	
	//constructor
	public Envio(String estadoDeEnvio, LinkedList<Venta> ventas, LinkedList<Cliente> clientes) {
		super();
		this.estadoDeEnvio = estadoDeEnvio;
		this.ventas = ventas;
		this.clientes = clientes;
	}
	//getters&setters

	public String getEstadoDeEnvio() {
		return estadoDeEnvio;
	}

	public void setEstadoDeEnvio(String estadoDeEnvio) {
		this.estadoDeEnvio = estadoDeEnvio;
	}

	public LinkedList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(LinkedList<Venta> ventas) {
		this.ventas = ventas;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	

	
	
	
	
}
