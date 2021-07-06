package lickeypablo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedanAgregarJugadoresAlTorneo() {
		String NyA="Gonzalo Montiel";
		String DNI="41.147.235";
		String equipo="Argentina";
		String posicion="DEF";
		Integrante jugador1= new Jugador(NyA,DNI,equipo,posicion);
		
		String NyA2="Guillermo Maripán";
		String DNI2="41.147.487";
		String posicion2="DEL";
		Integrante jugador2= new Jugador(NyA2,DNI2,equipo,posicion);
		
		String NyA="Lionel Scaloni";
		
		
	}

}
