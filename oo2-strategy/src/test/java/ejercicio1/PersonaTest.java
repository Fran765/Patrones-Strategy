package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ejercicio2.dominio.FechaNacimientoCorto;
import ejercicio2.dominio.FechaNacimientoLarga;
import ejercicio2.dominio.Persona;

class PersonaTest {

	@Test
	void testFormatoCorto() {

		Persona p1 = new Persona(LocalDate.of(2000, 11, 16), new FechaNacimientoCorto());
		String resultadoEsperado = "16-11-2000";

		assertEquals(resultadoEsperado, p1.fechaNacimiento());
	}

	@Test
	void testFormatoLargo() {

		Persona p2 = new Persona(LocalDate.of(2000, 11, 16), new FechaNacimientoLarga());
		String resultadoEsperado = "16 de noviembre de 2000";

		assertEquals(resultadoEsperado, p2.fechaNacimiento());
	}

}
