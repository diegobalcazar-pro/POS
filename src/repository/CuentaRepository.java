package repository;

import java.util.LinkedList;
import java.util.List;

import BLL.Cuenta;
import BLL.Usuario;

public interface CuentaRepository {
    void agregarCuenta(Cuenta cuenta);
    List<Cuenta> mostrarCuentas();
	<T> T login(String usuario, String contrasena);
	LinkedList<Cuenta> mostrarEmpleados();
}
