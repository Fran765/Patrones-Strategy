package ejercicio2.dominio;

import java.time.LocalDate;

public class Persona {

	private FechaNacimientoStrategy formatoDeFecha;
	private LocalDate fechaDeCumpleaños;

	public Persona(LocalDate fecha, FechaNacimientoStrategy formato) {
		this.fechaDeCumpleaños = fecha;
		this.formatoDeFecha = formato;
	}

	public String fechaNacimiento() {
		return formatoDeFecha.formatoFecha(fechaDeCumpleaños);
	}

}