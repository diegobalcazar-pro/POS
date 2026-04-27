package GUI;

import javax.swing.JOptionPane;

import DLL.Conexion;
import DLL.ControllerCuenta;
import BLL.Cuenta;
import BLL.Empleado;
import BLL.Admin;

public class Main {
    public static void main(String[] args) {
        
    	Conexion.getInstance();
    	

        String[] acciones = { "Login", "Registrar", "Salir" };
        int menu = 0;
        
        do {
            menu = JOptionPane.showOptionDialog(null, "Bienvenido", null, 0, 0, null, acciones, acciones[0]);

            switch (menu) {
                case 0:
                  
                    Cuenta cuenta = Cuenta.Login(usuario, contrasena);
                    if (cuenta != null) {
                        if (cuenta instanceof Admin) {
                            JOptionPane.showMessageDialog(null, "Sofía Lopez Admin " + cuenta.getNombre());
                            // Ir a menu de profesor
                            cuenta.Menu();
                        } else if (cuenta instanceof Empleado) {
                            JOptionPane.showMessageDialog(null, "Bienvenido Empleado " + cuenta.getNombre());
                            // Ir a menu de alumno
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    }
                    break;

                case 1: 
                	
                	//falta registrar :D
                    
                    break;
            }
        } while (menu != 2);
    }
}
