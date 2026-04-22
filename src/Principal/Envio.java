package Principal;

import java.util.LinkedList;

public class Envio {

	//atributos
	private String estadoDeEnvio;
	private LinkedList pedidos;
	private LinkedList Clientes;
	//constructor
	public Envio(String estadoDeEnvio, LinkedList pedidos, LinkedList clientes) {
		super();
		this.estadoDeEnvio = estadoDeEnvio;
		this.pedidos = pedidos;
		Clientes = clientes;
	}
	//getters&setters
	public String getEstadoDeEnvio() {
		return estadoDeEnvio;
	}
	public void setEstadoDeEnvio(String estadoDeEnvio) {
		this.estadoDeEnvio = estadoDeEnvio;
	}
	public LinkedList getPedidos() {
		return pedidos;
	}
	public void setPedidos(LinkedList pedidos) {
		this.pedidos = pedidos;
	}
	public LinkedList getClientes() {
		return Clientes;
	}
	public void setClientes(LinkedList clientes) {
		Clientes = clientes;
	}
	
	
}
