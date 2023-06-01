package ejercicio2.main;

import java.time.LocalDate;

import ejercicio2.dominio.FechaNacimientoCorto;
import ejercicio2.dominio.FechaNacimientoLarga;
import ejercicio2.dominio.Persona;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona(LocalDate.of(2000, 11, 16), new FechaNacimientoCorto());

		Persona p2 = new Persona(LocalDate.of(2000, 11, 16), new FechaNacimientoLarga());

		System.out.println("formato corto: " + p1.fechaNacimiento());
		System.out.println("formato largo: " + p2.fechaNacimiento());
	}

}
