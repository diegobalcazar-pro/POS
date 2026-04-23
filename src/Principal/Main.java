package Principal;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Producto> listaProductos = new ArrayList<>();
		ArrayList<Proveedor> listaProveedor = new ArrayList<>();
		ArrayList<String> ventasHoy = new ArrayList<>();
		
		Cliente C1 = new Cliente("Beison", "Tiznado", "12345678", "11 2345 6876", "beison@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "Mayorista");
		listaClientes.add(C1);
		Cliente C2 = new Cliente("Ian", "Japan", "65373456", "11 3241 7424", "ian@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "Mayorista");
		listaClientes.add(C2);
		Proveedor Pr1= new Proveedor("Jose", "Robles", "16384278", "11 4635 9474", "jose@gmail.com", "Av rivadavia 1274", "Caballito, Buenos Aires", "Zapatos");
		listaProveedor.add(Pr1);
		Producto P1 = new Producto(1,"Remera Boca", "Remera temporada 2025/26", 59800,10,null);
		listaProductos.add(P1);
		
		
		
		String[] menu_cajero = { "Realizar Venta", "Ver Caja", "Ver Stock Tienda", "Ver Ventas HOY", "Cerrar Caja", "Cerrar Sesion" };

		//JOptionPane.showMessageDialog(null, "Buen dia Cajero (dia/mes/año)");
		
		double dineroencaja=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero que hay en caja"));
		
		boolean flag_menu_principal=true;
//-------------------------------------------------------------------------- INICIO DEL MENU DEL EMPLEADO CAJERO -----------------------------------------------------------------------------------------------------------------------------
		do {
			
			int elegido = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_cajero, menu_cajero[0]);
			
			switch (elegido) {
	        case 0:
				//Realizar Venta
	        	System.out.println("Realizar Venta");
	        	
	        	//Opciones de Venta
	        	String[] menu_Venta = { "Cliente", "Agregar Producto", "Borrar Producto", "Procesar Cobro", "Volver" };    		
	        	
	        	boolean flag_opcion_venta=true;
	        	ArrayList<DetalleVenta> carrito = new ArrayList<>();
	        	Cliente clienteSeleccionado = null;
	        	//--------------------------------------------------------- MENU DE REALIZAR VENTA --------------------------------------------------------------
                do {
	        		
                	String textoMenu = "Seleccione una opcion\n";

                	if (clienteSeleccionado != null) {
                	    textoMenu += "Cliente: "
                	               + clienteSeleccionado.getNombre()
                	               + " " + clienteSeleccionado.getApellido() + "\n";
                	}
                	
                	double total = 0;

                	if (!carrito.isEmpty()) {
                	    textoMenu += "\nCARRITO:\n";

                	    for (DetalleVenta d : carrito) {
                	        textoMenu += "- " + d.getProducto().getNombreProducto()
                	                   + " x" + d.getCantidad()
                	                   + " ($" + d.getPreciounitario() + ")\n";

                	        total += d.getCantidad() * d.getPreciounitario();
                	    }

                	    textoMenu += "\nTOTAL: $" + total + "\n";
                	}
                	
	        		int elegido_venta = JOptionPane.showOptionDialog(null, textoMenu, null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_Venta, menu_Venta[0]);
	        		
	            	
	            	switch (elegido_venta) {
	    			case 0:
	    				//-------------CLIENTE---------------
	    				
	    				String[] menu_Cliente = { "Seleccionar Cliente", "Nuevo Cliente", "Volver" };
	    				boolean flag_opcion_cliente=true;
	    				
	    				do {
	    					
	    					int elegido_opcion_cliente = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_Cliente, menu_Cliente[0]);
		    				
		    				if (elegido_opcion_cliente==0) {
		    				
		    					if (listaClientes.isEmpty()) {
		    					    JOptionPane.showMessageDialog(null, "No hay clientes");
		    					    break;
		    					}

		    					clienteSeleccionado = (Cliente) JOptionPane.showInputDialog(
		    					        null,
		    					        "Seleccione un cliente:",
		    					        "Clientes",
		    					        JOptionPane.QUESTION_MESSAGE,
		    					        null,
		    					        listaClientes.toArray(),
		    					        listaClientes.get(0)
		    					);

		    					if (clienteSeleccionado != null) {
		    					    JOptionPane.showMessageDialog(null,
		    					        "Cliente seleccionado:\n" +
		    					        clienteSeleccionado.getNombre() + " " +
		    					        clienteSeleccionado.getApellido()
		    					    );
		    					}
		    					
			    	            //sale del menu_cliente
			    	            flag_opcion_cliente=false;
			    	            
							} else if (elegido_opcion_cliente==1){
							    //NUEVO CLIENTE ----------------------------
								JOptionPane.showMessageDialog(null, "Nuevo Cliente");
								Cliente nuevo = crearCliente();
								listaClientes.add(nuevo);
								
							} else {
								//VOLVER ----------------------------
								//sale del menu_cliente
								flag_opcion_cliente=false;
							}
	    					
						} while (flag_opcion_cliente!=false);
	    				
	    				break;
	    			case 1:
	    				//-------------AGREGAR PRODUCTO----------------
	    				/*if (listaProductos.isEmpty()) {
	    					JOptionPane.showMessageDialog(null, "No hay productos disponibles");
	    				}
	    				
	    				Producto nuevo = crearProducto(listaProveedor);
	    			    listaProductos.add(nuevo);*/
	    			    
	    				if (listaProductos.isEmpty()) {
	    			        JOptionPane.showMessageDialog(null, "No hay productos disponibles");
	    			        break;
	    			    }

	    			    Producto seleccionado = (Producto) JOptionPane.showInputDialog(
	    			            null,
	    			            "Seleccione un producto:",
	    			            "Productos",
	    			            JOptionPane.QUESTION_MESSAGE,
	    			            null,
	    			            listaProductos.toArray(),
	    			            listaProductos.get(0)
	    			    );

	    			    if (seleccionado != null) {

	    			        int cantidad = Integer.parseInt(
	    			            JOptionPane.showInputDialog("Ingrese cantidad:")
	    			        );

	    			        if (cantidad <= 0) {
	    			            JOptionPane.showMessageDialog(null, "Cantidad inválida");
	    			            break;
	    			        }

	    			        if (seleccionado.getStock() >= cantidad) {

	    			            //CREAR DETALLE
	    			            DetalleVenta detalle = new DetalleVenta(
	    			                seleccionado,
	    			                cantidad,
	    			                seleccionado.getPrecio()
	    			            );

	    			            carrito.add(detalle);

	    			            //DESCONTAR STOCK
	    			            seleccionado.setStock(seleccionado.getStock() - cantidad);

	    			            JOptionPane.showMessageDialog(null,
	    			                "Producto agregado:\n" +
	    			                seleccionado.getNombreProducto() +
	    			                "\nCantidad: " + cantidad
	    			            );

	    			        } else {
	    			            JOptionPane.showMessageDialog(null, "Stock insuficiente");
	    			        }
	    			    }
	    			    
	    			    
	    				break;
	    			case 2:
	    				//-------------BORRAR PRODUCTO-----------------
	    				
	    				if (carrito.isEmpty()) {
	    			        JOptionPane.showMessageDialog(null, "El carrito está vacío");
	    			        break;
	    			    }

	    			    DetalleVenta eliminar = (DetalleVenta) JOptionPane.showInputDialog(
	    			            null,
	    			            "Seleccione producto a eliminar:",
	    			            "Eliminar",
	    			            JOptionPane.QUESTION_MESSAGE,
	    			            null,
	    			            carrito.toArray(),
	    			            carrito.get(0)
	    			    );

	    			    if (eliminar != null) {

	    			        // devolver stock
	    			        Producto p = eliminar.getProducto();
	    			        p.setStock(p.getStock() + eliminar.getCantidad());

	    			        carrito.remove(eliminar);
	    			    }
	    				
	    				break;
	    			case 3:
	    				//-------------PROCESAR COBRO------------------
	    				if (clienteSeleccionado == null) {
	    			        JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
	    			        break;
	    			    }

	    			    if (carrito.isEmpty()) {
	    			        JOptionPane.showMessageDialog(null, "El carrito está vacío");
	    			        break;
	    			    }

	    			    //CALCULAR TOTAL
	    			    double ntotal = 0;
	    			    for (DetalleVenta d : carrito) {
	    			    	ntotal += d.getCantidad() * d.getPreciounitario();
	    			    }

	    			    //MEDIO DE PAGO
	    			    String[] mediosPago = {"Efectivo","Transferencia"};

	    			    String medio = (String) JOptionPane.showInputDialog(
	    			            null,
	    			            "Seleccione medio de pago\nTotal: $" + ntotal,
	    			            "Cobro",
	    			            JOptionPane.QUESTION_MESSAGE,
	    			            null,
	    			            mediosPago,
	    			            mediosPago[0]
	    			    );

	    			    if (medio == null) break;

	    			    //CONFIRMAR
	    			    int confirmar = JOptionPane.showConfirmDialog(
	    			            null,
	    			            "Confirmar venta?\nTotal: $" + ntotal,
	    			            "Confirmación",
	    			            JOptionPane.YES_NO_OPTION
	    			    );

	    			    if (confirmar != JOptionPane.YES_OPTION) break;

	    			    //GENERAR TICKET
	    			    String ticket = "===== TICKET =====\n\n";

	    			    ticket += "Cliente: " 
	    			            + clienteSeleccionado.getNombre() + " "
	    			            + clienteSeleccionado.getApellido() + "\n\n";

	    			    for (DetalleVenta d : carrito) {
	    			        ticket += d.getProducto().getNombreProducto()
	    			                + " x" + d.getCantidad()
	    			                + " $" + d.getPreciounitario() + "\n";
	    			    }

	    			    ticket += "\nTOTAL: $" + ntotal;
	    			    ticket += "\nPago: " + medio;
	    			    ticket += "\n===================";

	    			    JOptionPane.showMessageDialog(null, ticket);

	    			    //GUARDAR VENTA
	    			    ventasHoy.add(ticket);

	    			    dineroencaja += total;

	    			 
	    			    carrito.clear();
	    			    clienteSeleccionado = null;

	    			    JOptionPane.showMessageDialog(null, "Venta éxitosa");
	    				
	    				break;
	    			case 4:
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
	        	JOptionPane.showMessageDialog(null, 
	        	        "ESTADO DE CAJA\nDinero en caja: $" + dineroencaja);
				break;
	        case 2:
	        	//--------------------------------------------------------- MENU DE VER STOCK TIENDA ------------------------------------------------------
	        	System.out.println("Ver Stock Tienda");
	        	
	        	if (listaProductos.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "No hay productos en stock");
	                break;
	            }
	            
	            String stock = "STOCK TIENDA:\n";
	            
	            for (Producto p : listaProductos) {
	            	stock += "- " + p.getNombreProducto() + " | Cant. " + p.getStock() + " | $" + p.getPrecio() + "\n";
	            }
	            
	            JOptionPane.showMessageDialog(null, stock);
	            
				break;
	        case 3:
	        	//--------------------------------------------------------- MENU DE VER VENTAS HOY --------------------------------------------------------
	        	System.out.println("Ver Ventas HOY");
	        	
	        	if (ventasHoy.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "No hay ventas hoy");
	                break;
	            }
	            
	            String ventas = "VENTAS DEL DÍA:\n";
	            
	            for (String v : ventasHoy) {
	                ventas += "- " + v + "\n";
	            }
	            
	            JOptionPane.showMessageDialog(null, ventas);
	            
				break;
	        case 4:
	        	//--------------------------------------------------------- MENU DE CERRAR CAJA -----------------------------------------------------------
	        	System.out.println("Cerrar Caja");
	        	JOptionPane.showMessageDialog(null, "Fin del Día, en Caja $:"+dineroencaja);
	        	flag_menu_principal=false;
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
	public static Cliente crearCliente() {
		
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
        System.out.println("CLIENTE CREADO EXITOSAMENTE\n"+"NOMBRE:"+nuevo.getNombre()+" APELLIDO: "+nuevo.getApellido()+" DNI: "+nuevo.getDni()+" TEL: "+nuevo.getTelefono()+" DNI: "+nuevo.getDni()+" MAIL: "+nuevo.getMail()+" DIRECCION: "+nuevo.getDireccion()+" LOCALIDAD: "+nuevo.getLocalidad()+" TIPO: "+nuevo.getTipo());
        JOptionPane.showMessageDialog(null, "CLIENTE CREADO EXITOSAMENTE\n"+"\nNOMBRE:"+nuevo.getNombre()+"\nAPELLIDO: "+nuevo.getApellido()+"\nDNI: "+nuevo.getDni()+"\nTEL: "+nuevo.getTelefono()+"\nDNI: "+nuevo.getDni()+"\nMAIL: "+nuevo.getMail()+"\nDIRECCION: "+nuevo.getDireccion()+"\nLOCALIDAD: "+nuevo.getLocalidad()+"\nTIPO: "+nuevo.getTipo());
        return nuevo;
    }
	
     public static Producto crearProducto(ArrayList<Proveedor> listaProveedor) {
    	 
		String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del Producto");
		String descripcionProducto = JOptionPane.showInputDialog("Ingrese la desrcipcion");
		double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock"));
		
		// ---- SELECCIÓN DE PROVEEDOR ----
	    String[] opcionesProveedor = new String[listaProveedor.size()];

	    for (int i = 0; i < listaProveedor.size(); i++) {
	        Proveedor p = listaProveedor.get(i);
	        opcionesProveedor[i] = p.getNombre() + " - " + p.getDescripcionProveedor();
	    }

	    String seleccion = (String) JOptionPane.showInputDialog(
	            null,
	            "Seleccione un proveedor:",
	            "Proveedor",
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            opcionesProveedor,
	            opcionesProveedor[0]
	    );

	    Proveedor proveedorSeleccionado = null;

	    for (Proveedor p : listaProveedor) {
	        String texto = p.getNombre() + " - " + p.getDescripcionProveedor();
	        if (texto.equals(seleccion)) {
	            proveedorSeleccionado = p;
	            break;
	        }
	    }

	    LinkedList<Proveedor> proveedores = new LinkedList<>();
	    proveedores.add(proveedorSeleccionado);
		
		//codigo
	    int codigo=1;
	    
	    codigo=codigo+1;


        Producto nuevo= new Producto(codigo,nombreProducto, descripcionProducto, precioProducto, stock, proveedores);
        System.out.println("PRODUCTO CREADO EXITOSAMENTE\n"+"CODIGO: " + nuevo.getCodigo() + "\nPRODUCTO:"+nuevo.getNombreProducto()+" DESCRIPCION: "+nuevo.getDescripcionProducto()+" PRECIO: $"+nuevo.getPrecio()+" STOCK: "+nuevo.getStock()+" PROVEEDOR: "+nuevo.getProveedores());
        JOptionPane.showMessageDialog(null, "PRODUCTO CREADO EXITOSAMENTE\n"+"CODIGO: " + nuevo.getCodigo() + "\nPRODUCTO:"+nuevo.getNombreProducto()+"\nDESCRIPCION: "+nuevo.getDescripcionProducto()+"\nPRECIO: $"+nuevo.getPrecio()+"\nSTOCK: "+nuevo.getStock()+"\nPROVEEDOR: "+nuevo.getProveedores());
        return nuevo;
    }

}


