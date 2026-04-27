package BLL;

import java.util.ArrayList;
import java.util.Iterator;

import DLL.ControllerCuenta;

public class Cuenta extends Persona{
	protected String usuario;
	protected String contrasena;
	protected String legajo;
	protected String rolCuenta;
	private static ControllerCuenta controller = new ControllerCuenta();
	
	//Array Lista de cuentas
	static ArrayList<Cuenta> listaCuentas = new ArrayList<>();
	
	
	//Constructor
	public Cuenta(String nombre, String apellido, String dni, String telefono, String mail, String usuario,
			String contrasena, String legajo, String rolCuenta) {
		super(nombre, apellido, dni, telefono, mail);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.legajo = legajo;
		this.rolCuenta = rolCuenta;
	}


	//Getters y setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public String getRolCuenta() {
		return rolCuenta;
	}
	public void setRolCuenta(String rolCuenta) {
		this.rolCuenta = rolCuenta;
	}


	public static ControllerCuenta getController() {
		return controller;
	}


	public static void setController(ControllerCuenta controller) {
		Cuenta.controller = controller;
	}


	public static ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}


	public static void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		Cuenta.listaCuentas = listaCuentas;
	}


	//metodos
	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", contrasena=" + contrasena + ", legajo=" + legajo + ", rolCuenta="
				+ rolCuenta + "]";
	}
	
	public static Cuenta Login(String usuario, String contrasena) {
		for (Cuenta logeada : listaCuentas) {
			if (logeada.getUsuario().equals(usuario) && logeada.getContrasena().equals(contrasena) ) {
				return logeada;
			}
		}
		return null;
	}
	
	public void menu() {
		
	}


	

}