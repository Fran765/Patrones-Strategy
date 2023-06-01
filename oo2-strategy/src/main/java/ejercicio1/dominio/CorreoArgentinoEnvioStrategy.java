package ejercicio1.dominio;

import java.util.HashMap;
import java.util.Map;

public class CorreoArgentinoEnvioStrategy implements EnvioStrategy {

	private static final Integer MONTO_FIJO = 800;

	private Map<String, Integer> misDestinos;
	private CalculoDistancia medioDeCalculo;

	public CorreoArgentinoEnvioStrategy(CalculoDistancia medioDeCalculo) {
		this.medioDeCalculo = medioDeCalculo;
		this.inicializarDestinos();
	}

	public double costoEnvio(double peso, String destino) {

		double costoEnvio = MONTO_FIJO;
		if (misDestinos.containsKey(destino)) {
			costoEnvio = misDestinos.get(destino);
		} else {
			costoEnvio += (5 * this.medioDeCalculo.obtenerDistanciaEnKm(destino));
		}

		return costoEnvio;
	}

	private void inicializarDestinos() {

		this.misDestinos = new HashMap<String, Integer>();

		misDestinos.put("Capital Federal", 500);
	}

}
