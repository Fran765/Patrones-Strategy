package ejercicio2.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaNacimientoCorto implements FechaNacimientoStrategy {

	private static final String FORMATO = "d-MM-yyyy";

	@Override
	public String formatoFecha(LocalDate unaFecha) {
		return unaFecha.format(DateTimeFormatter.ofPattern(FORMATO));
	}

}
