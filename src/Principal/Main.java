package Principal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion de objetos
		Admin Diego = new Admin("Diego", "Balcazar", "45454545", "1155442266", "Diego@balcazar.com","diegobalca", "Diego1234", "001", "Admin","1");
		Admin Beison = new Admin("Beison", "Torres", "45111545", "1199442266", "beison@torres.com", "beisontorres","Beison1234", "002", "Admin","2");
		
		Empleado Gamaliel = new Empleado("Natanel", "Quiroz", "45454000", "1166442266", "gama@natan.com", "gamanatanael","Gama1234", "001", "Caja", "1", "Caja");
		Empleado Juan = new Empleado("Juan", "Carloni", "45454444", "1159992266", "juan@carloni.com", "juan", "1234", "002", "Deposito", "2", "Deposito");
		
		Cliente Ian = new Cliente("Ian", "Japan", "45454541", "1155442211", "Ian@japan.com", "Muy Lejos 123", "General Rodriguez", "Mayorista");
		Proveedor Lara = new Proveedor("Lara", "Ferreri", "1122334455", "1511223344", "lara@ferreri.com", "Sarmiento 1221", "CABA", "Proveedor de Camisetas de Futbol");
	
		
		//Usuarios agregados a la Lista de Cuentas para poder logearse.
		Cuenta.listaCuentas.add(Diego);
		Cuenta.listaCuentas.add(Beison);
		Cuenta.listaCuentas.add(Gamaliel);
		Cuenta.listaCuentas.add(Juan);
		
		
		//Login 
		Cuenta logueada = null;

		String[] opciones = { "Login", "Salir" };

		int opcion;
		do {
		    opcion = JOptionPane.showOptionDialog(null, "Elija opción", null, 0, 0, null, opciones, opciones);

		    if (opcion == 0) {

		        logueada = Cuenta.Login(
		                JOptionPane.showInputDialog("Ingrese Usuario"),
		                JOptionPane.showInputDialog("Ingrese contraseña")
		        );

		        if (logueada != null) {

		        	logueada.menu();
		           
		            } else {
                       
		            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		          }
		      }
	      	            
		} while (opcion != 1);
		
		
		
		        
		
	}

}
