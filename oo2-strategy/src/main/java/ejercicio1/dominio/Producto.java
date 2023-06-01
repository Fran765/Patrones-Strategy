package ejercicio1.dominio;

public class Producto {

	private double peso;
	private Integer precio;

	public Producto(double peso, Integer precio) {
		this.peso = peso;
		this.precio = precio;
	}

	Integer consultarPrecio() {
		return this.precio;
	}

	double consultarPeso() {
		return this.peso;
	}

}
