
package Principal;

import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] opcionesDeposito={"Gestion productos","Gestion pedidos","Gestion proveedores","Cerrar sesion"};
		
		Proveedor num1= new Proveedor("Beison", "Torres", "12345678", "1112345678", "beisontorres@gmail.com","Flores", "Buenos Aires", "");
		
		int elegido =JOptionPane.showOptionDialog(null, "Elija una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, opcionesDeposito, opcionesDeposito[0]);
		switch (elegido) {
		case 0:
			String[] opcionesGestionProductos={"Cargar producto","Eliminar producto","Modificar producto","Mover producto","Volver"};
			
			int elegido0 =JOptionPane.showOptionDialog(null, "Elija una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, opcionesGestionProductos, opcionesGestionProductos[0]);
			switch (elegido0) {
			case 0:
				String nombprod=JOptionPane.showInputDialog("Nombre del producto:");
				String descprod=JOptionPane.showInputDialog("Descripcion del producto:");
				double precprod=Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
				String provprod=JOptionPane.showInputDialog("Proveedor del producto:");
				Producto p1= new Producto(nombprod, descprod, precprod, null);
			
				
				JOptionPane.showMessageDialog(null, "Nombre del producto: "+nombprod+"\nDescripcion del producto: "+descprod+"\nPrecio del producto: "+precprod+"\nProveedor del producto: "+provprod);
				
				break;
		    case 1:
		    	
		    	break;
		    case 2:
		    	break;
		    case 3:
		    	String ubicacion1= "sucursal";
		    	String ubicacion2="almacen";
		    	
		    	Object[] opciones = {ubicacion1, ubicacion2};

		    	int seleccion = JOptionPane.showOptionDialog(
		    	    null, 
		    	    "¿A dónde desea mover el producto?", 
		    	    "Seleccionar Ubicación", 
		    	    JOptionPane.DEFAULT_OPTION, 
		    	    JOptionPane.QUESTION_MESSAGE, 
		    	    null, 
		    	    opciones, 
		    	    opciones[0]
		    	);

		    	if (seleccion == 0) {
		    	    JOptionPane.showMessageDialog(null, "Producto fue movido a: " + ubicacion1);
		    	} else if (seleccion == 1) {
		    	    JOptionPane.showMessageDialog(null, "Producto fue movido a: " + ubicacion2);
		    	}
		    	break;
		    case 4:
		    	JOptionPane.showMessageDialog(null, "Regresando al menu inicial");
				break;
			}
			break;

		case 1:
			String[] opcionesGestionPedidos={"Ver pedidos","Cupo diario de pedidos","Enviar pedido","Volver"};
			
			int elegido1 =JOptionPane.showOptionDialog(null, "Elija una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, opcionesGestionPedidos, opcionesGestionPedidos[0]);
			break;
		case 2:
			
		    break;
		}
	}

}
