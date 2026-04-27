package DLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import BLL.Usuario;
import BLL.Alumno;
import BLL.Cuenta;
import BLL.Profesor;
import repository.CuentaRepository;
import repository.UsuarioRepository;

public class ControllerCuenta<T extends Cuenta> implements CuentaRepository {

    private static Connection con = Conexion.getInstance().getConnection();

    @Override
    public T login(String usuario, String contrasena) {
        T cuenta = null;
        try {
            PreparedStatement stmt = con.prepareStatement(
                "SELECT * FROM usuario WHERE nombre = ? AND password = ?"
            );
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);

            ResultSet rs = stmt.executeQuery();

            //if porque un resultado
            if (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String rolCuenta = rs.getString("rolCuenta");

                switch (rolCuenta.toLowerCase()) {
                    case "empleado":
                        cuenta = (T) new Empleado(id, usuario, email, rolCuenta, contrasena);
                        break;
                    case "admin":
                    	cuenta = (T) new Admin(id, usuario, email, rolCuenta, contrasena);
                        break;
                    default:
                        System.out.println("Tipo de usuario desconocido: " + rolCuenta);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        try {
            PreparedStatement statement = con.prepareStatement(
                "INSERT INTO usuario (nombre, email, tipo, password) VALUES (?,?, ?, ?)"
            );
            statement.setString(1, cuenta.getNombre());
            statement.setString(2, cuenta.getMail());
            statement.setString(3, cuenta.getRolCuenta());
            statement.setString(4, cuenta.getContrasena());

            int filas = statement.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario agregado correctamente.");
            }
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "No se puede crear usuario con mail existente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public LinkedList<Cuenta> mostrarCuentas() {
        LinkedList<Cuenta> cuentas = new LinkedList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM cuenta");
            //se ejecuta la query
            ResultSet rs = stmt.executeQuery();

            //while porque trae varios resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");
                String password = rs.getString("password");

                switch (tipo.toLowerCase()) {
                    case "empleado":
                        cuentas.add((T) new Empleado(id, nombre, email, tipo, password));
                        break;
                    case "admin":
                    	cuentas.add((T) new Admin(id, nombre, email, tipo, password));
                        break;
                    default:
                        System.out.println("Tipo desconocido: " + tipo);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuentas;
    }
    @Override
    public LinkedList<Cuenta> mostrarEmpleados() {
        LinkedList<Cuenta> cuentas = new LinkedList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE tipo ='Empleado'");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");
                String contrasena = rs.getString("contrasena");

              
                        cuentas.add((T) new Empleado(nombre, apellido, dni, telefono, mail, usuario, contrasena, legajo, rolCuenta, idEmpleado, rolEmpleado));

          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuentas;
    }
}
