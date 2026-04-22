package Principal;

public class Categoria {

	protected String nombreCategoria;

	
	//Constructor
	public Categoria(String nombreCategoria) {
		super();
		this.nombreCategoria = nombreCategoria;
	}


	
	//getters y setters
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}



	//Metodos
	@Override
	public String toString() {
		return "Categoria [nombreCategoria=" + nombreCategoria + "]";
	}
	
	
	
	
}
