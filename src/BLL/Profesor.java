package BLL;

import javax.swing.JOptionPane;

import repository.Validaciones;

public class Profesor extends Usuario implements Validaciones{

	public Profesor(int id, String nombre, String email, String tipo, String password) {
		super(id, nombre, email, tipo, password);
	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + "]";
	}

	@Override
	public void Menu() {

		String[] opciones = { "Agregar alumnos", "Ver alumno", "Salir" };
		int opcion;
		do {

			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "", 0, 0, null, opciones, opciones);
			switch (opcion) {
			case 0:
				//String nombre, String email, String tipo, String password	
				this.getController().agregarUsuario(new Alumno(validarIngresoString("Ingrese nombre"),validarIngresoString("Ingrese mail"),"Alumno",validarIngresoString("Ingrese password")));
				break;
			case 1:
				JOptionPane.showMessageDialog(null, this.getController().mostrarAlumnos());
				break;

			default:
				break;
			}
		} while (opcion != 2);

	}

}
