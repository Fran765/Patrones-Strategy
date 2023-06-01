package ejercicio1.dominio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comercio {

	private Map<Integer, EnvioStrategy> mediosDeEnvio;

	public Comercio(CalculoDistancia medioDeCalculoDistancia) {
		this.cargarMediosDeEnvio(medioDeCalculoDistancia);
	}

	public double calcularCostoTotal(List<Producto> productosSeleccionados, Integer medioEnvio, String destino) {

		double costoTotal = 0;
		double pesoTotal = 0;

		for (Producto unProducto : productosSeleccionados) {
			costoTotal += unProducto.consultarPrecio();
			pesoTotal += unProducto.consultarPeso();
		}

		costoTotal += this.mediosDeEnvio.get(medioEnvio).costoEnvio(pesoTotal, destino);

		return costoTotal;

	}

	private void cargarMediosDeEnvio(CalculoDistancia medioDeCalculoDistancia) {
		this.mediosDeEnvio = new HashMap<Integer, EnvioStrategy>();

		this.mediosDeEnvio.put(1, new ColectivoSurEnvioStrategy());
		this.mediosDeEnvio.put(2, new CorreoArgentinoEnvioStrategy(medioDeCalculoDistancia));
	}

}
