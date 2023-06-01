package ejercicio1.dominio;

import java.util.HashMap;
import java.util.Map;

public class ColectivoSurEnvioStrategy implements EnvioStrategy {

	private static final Integer COSTO_ENVIO_INTERIOR_PAIS = 3000;

	private Map<String, Integer> misDestinos;

	public ColectivoSurEnvioStrategy() {
		this.inicializarDestinos();
	}

	public double costoEnvio(double peso, String destino) {

		double costoEnvio = COSTO_ENVIO_INTERIOR_PAIS;

		if (misDestinos.containsKey(destino))
			costoEnvio = misDestinos.get(destino);

		if ((peso > 5) && (peso < 30)) {
			costoEnvio += 500;
		} else if (peso > 30) {
			costoEnvio += 2000;
		}

		return costoEnvio;
	}

	private void inicializarDestinos() {

		this.misDestinos = new HashMap<String, Integer>();

		misDestinos.put("Capital Federal", 1000);
		misDestinos.put("Gran Buenos Aires", 1500);
	}
}
