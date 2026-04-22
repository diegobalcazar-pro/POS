package Principal;

public class MedioDePago {
	protected String tipoDePago;

	
	//Constructor
	public MedioDePago(String tipoDePago) {
		super();
		this.tipoDePago = tipoDePago;
	}


	//getters y setters
	public String getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}


	//Metodos
	@Override
	public String toString() {
		return "MedioDePago [tipoDePago=" + tipoDePago + "]";
	}
	
	

}
