package ejercicio2;

import ejercicio1.dominio.CalculoDistancia;

public class FakeCalculoDistancia implements CalculoDistancia {

	@Override
	public double obtenerDistanciaEnKm(String destino) {
		return 200;
	}

}
