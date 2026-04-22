package Principal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente C1 = new Cliente("Beison", "Tiznado", "12345678", "11 2345 6876", "beison@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "mayorista");
		Cliente C2 = new Cliente("Ian", "Japan", "65373456", "11 3241 7424", "ian@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "mayorista");
		Proveedor Pr1= new Proveedor("Jose", "Robles", "16384278", "11 4635 9474", "jose@gmail.com", "Av rivadavia 1274", "Caballito, Buenos Aires", "Zapatos");
		Producto P1 = new Producto("Remera Boca", null, 0, null);
		
		
		
		String[] menu_cajero = { "Realizar Venta", "Ver Caja", "Ver Stock Tienda", "Ver Ventas HOY", "Cerrar Caja", "Cerrar Sesion" };

		//JOptionPane.showMessageDialog(null, "Buen dia Cajero (dia/mes/año)");
		
		//double dineroencaja=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero que hay en caja"));
		
		boolean flagmenuprincipal=true;
		
		do {
			
			int elegido = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_cajero, menu_cajero[0]);
			
			switch (elegido) {
	        case 0:
				//Realizar Venta
	        	System.out.println("Realizar Venta");
	        	
	        	//Opciones de Venta
	        	String[] menu_Venta = { "Cliente", "Escanear Producto", "Agregar Producto", "Borrar Producto", "Modificar Producto", "Procesar Cobro", "Volver" };    		
	        	
	        	boolean flagopcionventa=true;
	        	
	        	do {
	        		
	        		int elegido_venta = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_Venta, menu_Venta[0]);
	        		
	            	
	            	switch (elegido_venta) {
	    			case 0:
	    				//Cliente
	    				String[] opciones = {"Cliente 1", "Cliente 2", "Cliente 3"};

	    	            String seleccion = (String) JOptionPane.showInputDialog(
	    	                    null,
	    	                    "Elegí una opción:",
	    	                    "Selector",
	    	                    JOptionPane.QUESTION_MESSAGE,
	    	                    null,
	    	                    opciones,
	    	                    opciones[0]  // valor por defecto
	    	            );
	    				
	    				break;
	    			case 1:
	    				//Escanear Producto
	    				
	    				break;
	    			case 2:
	    				//Agregar Producto
	    				
	    				break;
	    			case 3:
	    				//Borrar Producto
	    				
	    				break;
	    			case 4:
	    				//Modificar Producto
	    				
	    				break;
	    			case 5:
	    				//Procesar Cobro
	    				
	    				break;
	    			case 6:
	    				//Volver
	    				System.out.println("Volver a menu");
	    				flagopcionventa=false;
	    				break;

	    			default:
	    				break;
	    			}
	        		
					
				} while (flagopcionventa=false);
	        	
	        	
				break;
	        case 1:
				//Ver Caja
	        	System.out.println("Ver Caja");
	        	
				break;
	        case 2:
				//Ver Stock Tienda
	        	System.out.println("Ver Stock Tienda");
	        	
				break;
	        case 3:
				//Ver Ventas HOY
	        	System.out.println("Ver Ventas HOY");
	        	
				break;
	        case 4:
				//Cerrar Caja
	        	System.out.println("Cerrar Caja");
				break;
	        case 5:
				//Cerrar Sesion
	        	System.out.println("Cerrar Sesion");
	        	flagmenuprincipal=false;
				break;

			default:
				break;
			}
			
		} while (flagmenuprincipal=false);
		
		
		
		
	}

}
