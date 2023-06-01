package ejercicio1.dominio;

import java.util.Random;

public class PaginaWebCalculoDistancia implements CalculoDistancia {

	public double obtenerDistanciaEnKm(String destino) {
		Random random = new Random();

		return random.nextInt(900) + 101;
	}

}
