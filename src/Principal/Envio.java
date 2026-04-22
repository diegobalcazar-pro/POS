package Principal;

import java.util.LinkedList;

public class Envio {

	//atributos
	protected String estadoDeEnvio;
	protected LinkedList <Pedido> pedidos;
	protected LinkedList <Cliente> clientes;
	
	
	//Constructor
	public Envio(String estadoDeEnvio, LinkedList<Pedido> pedidos, LinkedList<Cliente> clientes) {
		super();
		this.estadoDeEnvio = estadoDeEnvio;
		this.pedidos = pedidos;
		this.clientes = clientes;
	}


	
	//Getters y setters
	public String getEstadoDeEnvio() {
		return estadoDeEnvio;
	}
	public void setEstadoDeEnvio(String estadoDeEnvio) {
		this.estadoDeEnvio = estadoDeEnvio;
	}


	public LinkedList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public LinkedList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}



	//Metodos
	@Override
	public String toString() {
		return "Envio [estadoDeEnvio=" + estadoDeEnvio + ", pedidos=" + pedidos + ", clientes=" + clientes + "]";
	}
	
	
	
	
}
