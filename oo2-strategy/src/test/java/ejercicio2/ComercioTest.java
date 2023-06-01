package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

import ejercicio1.dominio.Comercio;
import ejercicio1.dominio.Producto;

class ComercioTest {

	@Test
	void testEnvioPorColectivoSur() {

		Comercio comercio = new Comercio(new FakeCalculoDistancia());

		Producto prod1 = new Producto(1, 10000);
		Producto prod2 = new Producto(10, 24000);

		double precioEsperadoParaGranBsAs = 31500;
		double precioEsperadoRestoPais = 87000;
		double precioEsperadoParaCapitalFederal = 31000;

		assertEquals(precioEsperadoParaGranBsAs,
				comercio.calcularCostoTotal(List.of(prod1, prod1, prod1), 1, "Gran Buenos Aires"));

		assertEquals(precioEsperadoRestoPais,
				comercio.calcularCostoTotal(List.of(prod2, prod2, prod2, prod1), 1, "Viedma"));

		assertEquals(precioEsperadoParaCapitalFederal,
				comercio.calcularCostoTotal(List.of(prod1, prod1, prod1), 1, "Capital Federal"));
	}

	@Test
	void testEnvioPorCorreoArgentino() {

		Comercio comercio = new Comercio(new FakeCalculoDistancia());

		Producto prod1 = new Producto(1, 10000);
		Producto prod2 = new Producto(10, 24000);

		double precioEsperadoCapitalFederal = 30500;
		double precioEsperadoRestoPais = 83800;

		assertEquals(precioEsperadoCapitalFederal,
				comercio.calcularCostoTotal(List.of(prod1, prod1, prod1), 2, "Capital Federal"));

		assertEquals(precioEsperadoRestoPais,
				comercio.calcularCostoTotal(List.of(prod2, prod2, prod2, prod1), 2, "Viedma"));
	}

}
