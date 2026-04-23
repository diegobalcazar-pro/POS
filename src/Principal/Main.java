package Principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Producto> listaProductos = new ArrayList<>();
		ArrayList<Proveedor> listaProveedor = new ArrayList<>();

		
		Cliente C1 = new Cliente("Beison", "Tiznado", "12345678", "11 2345 6876", "beison@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "Mayorista");
		listaClientes.add(C1);
		Cliente C2 = new Cliente("Ian", "Japan", "65373456", "11 3241 7424", "ian@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "Mayorista");
		listaClientes.add(C2);
		Proveedor Pr1= new Proveedor("Jose", "Robles", "16384278", "11 4635 9474", "jose@gmail.com", "Av rivadavia 1274", "Caballito, Buenos Aires", "Zapatos");
		listaProveedor.add(Pr1);
		Producto P1 = new Producto("Remera Boca", null, 0, null);
		listaProductos.add(P1);
		
		
		
		String[] menu_cajero = { "Realizar Venta", "Ver Caja", "Ver Stock Tienda", "Ver Ventas HOY", "Cerrar Caja", "Cerrar Sesion" };

		//JOptionPane.showMessageDialog(null, "Buen dia Cajero (dia/mes/año)");
		
		//double dineroencaja=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero que hay en caja"));
		
		boolean flag_menu_principal=true;
//-------------------------------------------------------------------------- INICIO DEL MENU DEL EMPLEADO CAJERO -----------------------------------------------------------------------------------------------------------------------------
		do {
			
			int elegido = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_cajero, menu_cajero[0]);
			
			switch (elegido) {
	        case 0:
				//Realizar Venta
	        	System.out.println("Realizar Venta");
	        	
	        	//Opciones de Venta
	        	String[] menu_Venta = { "Cliente", "Escanear Producto", "Agregar Producto", "Borrar Producto", "Modificar Producto", "Procesar Cobro", "Volver" };    		
	        	
	        	boolean flag_opcion_venta=true;
	        	
	        	//--------------------------------------------------------- MENU DE REALIZAR VENTA --------------------------------------------------------------
                do {
	        		
	        		int elegido_venta = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_Venta, menu_Venta[0]);
	        		
	            	
	            	switch (elegido_venta) {
	    			case 0:
	    				//-------------CLIENTE---------------
	    				
	    				String[] menu_Cliente = { "Seleccionar Cliente", "Nuevo Cliente", "Volver" };
	    				boolean flag_opcion_cliente=true;
	    				
	    				do {
	    					
	    					int elegido_opcion_cliente = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_Cliente, menu_Cliente[0]);
		    				
		    				if (elegido_opcion_cliente==0) {
		    					//SELECCIONAR CLIENTE ----------------------------
		    					/*
		    					String[] opciones = new String[listaClientes.size()];

		    					for (int i = 0; i < listaClientes.size(); i++) {
		    					    Cliente c = listaClientes.get(i);
		    					    opciones[i] = c.getNombre() + " " + c.getApellido();
		    					}
		    					
		    					String seleccion = (String) JOptionPane.showInputDialog(
		    					        null,
		    					        "Elegí un Cliente:",
		    					        "Selector",
		    					        JOptionPane.QUESTION_MESSAGE,
		    					        null,
		    					        opciones,
		    					        opciones[0]
		    					);
		    					
		    					
		    					Cliente clienteSeleccionado = null;

		    					for (Cliente c : listaClientes) {
		    					    String nombreCompleto = c.getNombre() + " " + c.getApellido();
		    					    if (nombreCompleto.equals(seleccion)) {
		    					        clienteSeleccionado = c;
		    					        break;
		    					    }
		    					}
		    					
		    					if (clienteSeleccionado != null) {
		    					    JOptionPane.showMessageDialog(null,
		    					        "Seleccionaste:\n" +
		    					        clienteSeleccionado.getNombre() + " " +
		    					        clienteSeleccionado.getApellido()
		    					    );
		    					}
								*/
		    					JOptionPane.showMessageDialog(null, listaClientes);
			    	            //sale del menu_cliente
			    	            flag_opcion_cliente=false;
			    	            
							} else if (elegido_opcion_cliente==1){
							    //NUEVO CLIENTE ----------------------------
								JOptionPane.showMessageDialog(null, "Nuevo Cliente");
								crearCliente();
								
							} else {
								//VOLVER ----------------------------
								//sale del menu_cliente
								flag_opcion_cliente=false;
							}
	    					
						} while (flag_opcion_cliente!=false);
	    				
	    			 
	    				
	    				break;
	    			case 1:
	    				//-------------ESCANEAR PRODUCTO---------------
	    			
	    				
	    				break;
	    			case 2:
	    				//-------------AGREGAR PRODUCTO----------------
	    				
	    				break;
	    			case 3:
	    				//-------------BORRAR PRODUCTO-----------------
	    				
	    				break;
	    			case 4:
	    				//-------------MODIFICAR PRODUCTO--------------
	    				
	    				break;
	    			case 5:
	    				//-------------PROCESAR COBRO------------------
	    				
	    				break;
	    			case 6:
	    				//-------------VOLVER ATRAS--------------------
	    				System.out.println("Volver a menu");
	    				//sale del menu_Venta
	    				flag_opcion_venta=false;
	    				
	    				break;
	    				
	    			default:
	    				break;
	    			}
	            	
	        		
					
				} while (flag_opcion_venta!=false);
	        	
                System.out.println("Fin del Bucle 2");
				break;
	        case 1:
	        	//--------------------------------------------------------- MENU DE VER CAJA --------------------------------------------------------------
	        	System.out.println("Ver Caja");
	        	
				break;
	        case 2:
	        	//--------------------------------------------------------- MENU DE VER STOCK TIENDA ------------------------------------------------------
	        	System.out.println("Ver Stock Tienda");
	        	
				break;
	        case 3:
	        	//--------------------------------------------------------- MENU DE VER VENTAS HOY --------------------------------------------------------
	        	System.out.println("Ver Ventas HOY");
	        	
				break;
	        case 4:
	        	//--------------------------------------------------------- MENU DE CERRAR CAJA -----------------------------------------------------------
	        	System.out.println("Cerrar Caja");
				break;
	        case 5:
	        	//--------------------------------------------------------- SALIR DEL PROGRAMA ------------------------------------------------------------
	        	System.out.println("Cerrar Sesion");
	        	
	        	//sale del programa
	        	flag_menu_principal=false;
				break;
				
	        default:
				break;
			}
			
		} while (flag_menu_principal!=false);
		
		System.out.println("Fin del Bucle");
		
		
	}
	
	//metodos
	public static void crearCliente() {
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del Cliente");
		String apellidoCliente = JOptionPane.showInputDialog("Ingrese el apellido del Cliente");
		String dniCliente = JOptionPane.showInputDialog("Ingrese el DNI del Cliente");
		String telefonoCliente = JOptionPane.showInputDialog("Ingrese el telefono del Cliente");
		String mailCliente = JOptionPane.showInputDialog("Ingrese el correo del Cliente");
		String direccionCliente = JOptionPane.showInputDialog("Ingrese la direccion del Cliente");
		String localidadCliente = JOptionPane.showInputDialog("Ingrese la localidad del Cliente");
		
		String tipoDeCliente;
		
		String[] tipoCliente = {"Minorista","Mayorista"};
		
		
		int opcion_tipo_cliente = JOptionPane.showOptionDialog(null, "Seleccione el Tipo de Cliente", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, tipoCliente, tipoCliente[0]);
		
		if (opcion_tipo_cliente==0) {
			//minorista
			tipoDeCliente="Minorista";
			
		} else {
			tipoDeCliente="Mayorista";
		}
        
        Cliente nuevo= new Cliente(nombreCliente, apellidoCliente, dniCliente, telefonoCliente, mailCliente, direccionCliente, localidadCliente, tipoDeCliente);
        listaClientes.add(nuevo);
        System.out.println("CLIENTE CREADO EXITOSAMENTE\n"+"NOMBRE:"+nuevo.getNombre()+" APELLIDO: "+nuevo.getApellido()+" DNI: "+nuevo.getDni()+" TEL: "+nuevo.getTelefono()+" DNI: "+nuevo.getDni()+" MAIL: "+nuevo.getMail()+" DIRECCION: "+nuevo.getDireccion()+" LOCALIDAD: "+nuevo.getLocalidad()+" TIPO: "+nuevo.getTipo());
        JOptionPane.showMessageDialog(null, "CLIENTE CREADO EXITOSAMENTE\n"+"\nNOMBRE:"+nuevo.getNombre()+"\nAPELLIDO: "+nuevo.getApellido()+"\nDNI: "+nuevo.getDni()+"\nTEL: "+nuevo.getTelefono()+"\nDNI: "+nuevo.getDni()+"\nMAIL: "+nuevo.getMail()+"\nDIRECCION: "+nuevo.getDireccion()+"\nLOCALIDAD: "+nuevo.getLocalidad()+"\nTIPO: "+nuevo.getTipo());

    }

}
