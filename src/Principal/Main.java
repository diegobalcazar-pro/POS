package Principal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente C1 = new Cliente("Beison", "Tiznado", "12345678", "11 2345 6876", "beison@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "mayorista");
		Cliente C2 = new Cliente("Ian", "Japan", "65373456", "11 3241 7424", "ian@gmail.com", "Av Corrientes 2313", "Balvanera, Buenos Aires", "mayorista");
		Proveedor Pr1= new Proveedor("Jose", "Robles", "16384278", "11 4635 9474", "jose@gmail.com", "Av rivadavia 1274", "Caballito, Buenos Aires", "Zapatos");
		Producto P1 = new Producto("Remera Boca", null, 0, null);
		
		
		
		String[] menu_cajero = { "Realizar Venta", "Ver Stock Tienda", "Ver Ventas HOY", "Cerrar Caja", "Cerrar Sesion" };

		JOptionPane.showMessageDialog(null, "Buen dia Cajero (dia/mes/año)");
		
		double dineroencaja=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dinero que hay en caja"));
		

		int elegido = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, menu_cajero, menu_cajero[0]);
		
		switch (elegido) {
        case 0:
			//Realizar Venta
        	System.out.println("Realizar Venta");
        	String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};

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
			//Ver Stock Tienda
        	System.out.println("Ver Stock Tienda");
        	
			break;
        case 2:
			//Ver Ventas HOY
        	System.out.println("Ver Ventas HOY");
        	
			break;
        case 3:
			//Cerrar Caja
        	System.out.println("Cerrar Caja");
			break;
        case 4:
			//Cerrar Sesion
        	System.out.println("Cerrar Sesion");
			break;

		default:
			break;
		}
		
		
		
	}

}
