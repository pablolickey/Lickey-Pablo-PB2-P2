package lickeypablo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedanAgregarJugadoresAlTorneo() {
		String nombreDelTorneo="copaAmerica";
		Torneo torneo= new Torneo(nombreDelTorneo);

		String NyA="Gonzalo Montiel";
		String DNI="41.147.235";
		String equipo="Argentina";
		String posicion="DEF";
		Integrante jugador1= new Jugador(NyA,DNI,equipo,posicion);
		torneo.agregarIntegrante(jugador1);
		
		String NyA2="Guillermo Maripán";
		String DNI2="41.147.487";
		String posicion2="DEL";
		Integrante jugador2= new Jugador(NyA2,DNI2,equipo,posicion);
		torneo.agregarIntegrante(jugador2);
		
		String NyA3="Lionel Scaloni";
		Integer edad=45;
		Integrante dt=new DT(NyA3,edad,equipo);
		torneo.agregarIntegrante(dt);
		
		assertEquals((Integer)3,torneo.cantidadDeIntegrantes());
		
	}

}
