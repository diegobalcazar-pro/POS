package Principal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String[] opcionesDeposito = { "Gestion productos", "Gestion pedidos", "Gestion proveedores", "Cerrar sesion" };

		Producto p1 = new Producto("Remera", "Remera DaVinci", 1000, null);
		Producto p2 = new Producto("Pantalon", "Pantalon Jeans", 2000, null);
		Producto p3 = new Producto("Camisa", "Camisa azul", 3000, null);
		Producto[] misProductos = { p1, p2, p3 };
		
		boolean programaCorriendo = true;
		while (programaCorriendo) {

			int elegido = JOptionPane.showOptionDialog(null, "Elija una opcion", "Depósito", JOptionPane.DEFAULT_OPTION,
					JOptionPane.DEFAULT_OPTION, null, opcionesDeposito, opcionesDeposito[0]);

			if (elegido == JOptionPane.CLOSED_OPTION) break;

			switch (elegido) {
			case 0: 
				boolean continuarProd = true;
				while (continuarProd) {
					String[] opcionesGestionProductos = { "Cargar producto", "Eliminar producto", "Modificar producto",
							"Mover producto", "Volver" };

					int elegido0 = JOptionPane.showOptionDialog(null, "Elija una opcion", "Gestión",
							JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcionesGestionProductos,
							opcionesGestionProductos[0]);

					switch (elegido0) {
					case 0:
						String nombprod = JOptionPane.showInputDialog("Nombre del producto:");
						String descprod = JOptionPane.showInputDialog("Descripcion del producto:");
						double precprod = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
						String provprod = JOptionPane.showInputDialog("Proveedor del producto:");

						JOptionPane.showMessageDialog(null, "Nombre: " + nombprod + "\nDescripcion: " + descprod
								+ "\nPrecio: " + precprod + "\nProveedor: " + provprod);
						break;

					case 1:
						String menu = "Escriba el número del producto a eliminar:\n\n" + "1. "
								+ (p1 != null ? p1.nombreProducto : "Eliminado") + "\n" + "2. "
								+ (p2 != null ? p2.nombreProducto : "Eliminado") + "\n" + "3. "
								+ (p3 != null ? p3.nombreProducto : "Eliminado");

						String seleccion = JOptionPane.showInputDialog(null, menu, "Eliminar",
								JOptionPane.QUESTION_MESSAGE);

						if (seleccion != null && seleccion.matches("[1-3]")) {
							int indice = Integer.parseInt(seleccion) - 1;
							if (misProductos[indice] != null) {
								String nombreBorrado = misProductos[indice].nombreProducto;
								misProductos[indice] = null;
								JOptionPane.showMessageDialog(null, "Objeto '" + nombreBorrado + "' borrado con éxito.");
							} else {
								JOptionPane.showMessageDialog(null, "El producto ya estaba vacío.");
							}
						}
						break;

					case 2:
						String elegida = JOptionPane.showInputDialog(null,
								"1. " + (p1 != null ? p1.nombreProducto : "N/A") + "\n2. "
										+ (p2 != null ? p2.nombreProducto : "N/A") + "\n3. "
										+ (p3 != null ? p3.nombreProducto : "N/A"),
								"Modificar Producto", JOptionPane.QUESTION_MESSAGE);

						if (elegida != null && elegida.matches("[1-3]")) {
							int idx = Integer.parseInt(elegida) - 1;
							Producto seleccionado = misProductos[idx];
							if (seleccionado == null) {
								JOptionPane.showMessageDialog(null, "No se puede modificar un producto eliminado.");
							} else {
								String campo = JOptionPane.showInputDialog(null, "Modificando: "
										+ seleccionado.nombreProducto + "\n1. Nombre\n2. Descripción\n3. Precio");

								if (campo != null && campo.matches("[1-3]")) {
									String nuevoValor = JOptionPane.showInputDialog("Ingrese el nuevo valor:");
									if (nuevoValor != null && !nuevoValor.isEmpty()) {
										if (campo.equals("1"))
											seleccionado.nombreProducto = nuevoValor;
										else if (campo.equals("2"))
											seleccionado.descripcionProducto = nuevoValor;
										else if (campo.equals("3") && nuevoValor.matches("[0-9.]+"))
											seleccionado.precio = Double.parseDouble(nuevoValor);
										JOptionPane.showMessageDialog(null, "¡Producto actualizado!");
									}
								}
							}
						}
						break;

					case 3:
						String menuMover = "Seleccione el producto que desea mover:\n" + "1. "
								+ (p1 != null ? p1.nombreProducto : "Vacío") + "\n" + "2. "
								+ (p2 != null ? p2.nombreProducto : "Vacío") + "\n" + "3. "
								+ (p3 != null ? p3.nombreProducto : "Vacío");

						String prodElegido = JOptionPane.showInputDialog(null, menuMover, "Mover Producto",
								JOptionPane.QUESTION_MESSAGE);

						if (prodElegido != null && prodElegido.matches("[1-3]")) {
							int idxMover = Integer.parseInt(prodElegido) - 1;
							Producto seleccionadoMover = misProductos[idxMover];

							if (seleccionadoMover == null) {
								JOptionPane.showMessageDialog(null, "El producto seleccionado ya no existe.");
							} else {
								String[] opcionesUbi = { "Sucursal", "Almacén" };
								int seleccionUbi = JOptionPane.showOptionDialog(null, "¿A dónde desea moverlo?",
										"Mover", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
										opcionesUbi, opcionesUbi[0]);

								if (seleccionUbi != JOptionPane.CLOSED_OPTION) {
									JOptionPane.showMessageDialog(null, "Movido a: " + opcionesUbi[seleccionUbi]);
								}
							}
						}
						break;

					case 4:
						continuarProd = false;       
						break;
					}
				}
				break;

			case 1: 
				boolean continuarPed = true;
				while (continuarPed) {
					String[] opcionesGestionPedidos = { "Ver pedidos", "Cupo diario", "Enviar pedido", "Volver" };
					int elegido1 = JOptionPane.showOptionDialog(null, "Gestión de Pedidos", null,
							JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcionesGestionPedidos,
							opcionesGestionPedidos[0]);

					String pedido1 = "ID: PED-001 | Cliente: Juan Perez";
					String pedido2 = "ID: PED-002 | Cliente: Maria Lopez";
					String pedido3 = "ID: PED-003 | Cliente: Ana Gomez";

					switch (elegido1) {
					case 0:
						JOptionPane.showMessageDialog(null, pedido1 + "\n" + pedido2 + "\n" + pedido3);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, "Cupo: 3 / 10 pedidos. [███-------] 30%");
						break;
					case 2: // Enviar pedido (Modificado para mostrar datos)
					    String menuEnvio = "Seleccione el pedido a ENVIAR:\n" +
					                       "1. " + pedido1 + "\n" +
					                       "2. " + pedido2 + "\n" +
					                       "3. " + pedido3;
					    
					    String selEnvio = JOptionPane.showInputDialog(null, menuEnvio, "Enviar Pedido", JOptionPane.QUESTION_MESSAGE);

					    if (selEnvio != null && selEnvio.matches("[1-3]")) {
					        String datosPedido = (selEnvio.equals("1")) ? pedido1 : 
					                             (selEnvio.equals("2")) ? pedido2 : pedido3;
					        
					        // Mostramos el mensaje de éxito con los datos completos
					        JOptionPane.showMessageDialog(null, 
					            "¡ENVÍO EXITOSO!\n\n" +
					            "Detalles del envío:\n" + datosPedido + "\n\n" +
					            "El pedido ha sido despachado al transporte.");
					    }
					    break;
					case 3:
						continuarPed = false;
						break;
					}
				}
				break;

			case 2:
				boolean continuarProv = true;
				while (continuarProv) {
					String[] opcionesGestionProveedores = { "Solicitar prod. faltantes", "Volver" };
					int elegido2 = JOptionPane.showOptionDialog(null, "Gestión de Proveedores", null,
							JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcionesGestionProveedores,
							opcionesGestionProveedores[0]);

					if (elegido2 == 0) {
						String menuFaltantes = "Producto a solicitar:\n1. " + p1.nombreProducto + "\n2. " + p2.nombreProducto;
						String selProv = JOptionPane.showInputDialog(null, menuFaltantes);
						if (selProv != null && selProv.matches("[1-2]"))
							JOptionPane.showMessageDialog(null, "Solicitud enviada.");
					} else {
						continuarProv = false;
					}
				}
				break;

			case 3:
				int confirmar = JOptionPane.showConfirmDialog(null, "¿Cerrar sesión?", "Salir", JOptionPane.YES_NO_OPTION);
				if (confirmar == JOptionPane.YES_OPTION) {
					programaCorriendo = false;
				}
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Sesión finalizada. ¡Adiós!");
	}
}