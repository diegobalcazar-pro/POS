package Principal;

public class DetalleVenta {

	//atributos
	private Producto producto;
	private int cantidad;
	private double preciounitario;
	
	//constructor
	public DetalleVenta(Producto producto, int cantidad, double preciounitario) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.preciounitario = preciounitario;
	}
	
	//getters&setters

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}
	//tostring

	@Override
	public String toString() {
		return "DetallePedido [producto=" + producto + ", cantidad=" + cantidad + ", preciounitario=" + preciounitario
				+ "]";
	}
	
	
}
