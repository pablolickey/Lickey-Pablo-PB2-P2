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
		Integer camiseta=4;
		Integrante jugador1= new Jugador(NyA,DNI,equipo,posicion,camiseta);
		torneo.agregarIntegrante(jugador1);
		
		String NyA2="Guillermo Maripán";
		String DNI2="41.147.487";
		String posicion2="DEL";
		Integer camiseta2=5;
		Integrante jugador2= new Jugador(NyA2,DNI2,equipo,posicion2,camiseta2);
		torneo.agregarIntegrante(jugador2);
		
		String NyA3="Lionel Scaloni";
		Integer edad=45;
		Integrante dt=new DT(NyA3,edad,equipo);
		torneo.agregarIntegrante(dt);
		
		assertEquals((Integer)3,torneo.cantidadDeIntegrantes());
		
	}
	
	@Test(expected= NoEsJugador.class)
	public void registrarPartidosAlTorneo() throws NoEsJugador{
		String nombreDelTorneo="copaAmerica";
		Torneo torneo= new Torneo(nombreDelTorneo);
		
		String equipo1="Argentina";
		String idDelPartido="1";
		String equipo2="Colombia";
		Partido ArgentinaVsColombia= new Partido(idDelPartido,equipo1,equipo2);

		String NyA="Gonzalo Montiel";
		String DNI="41.147.235";
		String posicion="DEF";
		Integer camiseta=4;
		Integrante jugador1= new Jugador(NyA,DNI,equipo1,posicion,camiseta);
		torneo.agregarIntegrante(jugador1);
		ArgentinaVsColombia.agregarJugadorLocal(jugador1);
		
		String NyA2="Guillermo Maripán";
		String DNI2="41.147.487";
		String posicion2="DEL";
		Integer camiseta2=5;
		Integrante jugador2= new Jugador(NyA2,DNI2,equipo1,posicion2,camiseta2);
		torneo.agregarIntegrante(jugador2);
		ArgentinaVsColombia.agregarJugadorLocal(jugador2);
		
		String NyA5="Lionel Scaloni";
		Integer edad=45;
		Integrante dt=new DT(NyA5,edad,equipo1);
		torneo.agregarIntegrante(dt);
		ArgentinaVsColombia.agregarJugadorLocal(dt);
		
		String NyA3="José María Giménez ";
		String DNI3="42.147.235";
		String posicion3="DEF";
		Integer camiseta3=6;
		Integrante jugador3= new Jugador(NyA3,DNI3,equipo2,posicion3,camiseta3);
		torneo.agregarIntegrante(jugador3);
		ArgentinaVsColombia.agregarJugadorVisitante(jugador3);
		
		String NyA4="Jean Meneses";
		String DNI4="41.481.487";
		String posicion4="DEL";
		Integer camiseta4=4;
		Integrante jugador4= new Jugador(NyA4,DNI4,equipo2,posicion4,camiseta4);
		torneo.agregarIntegrante(jugador4);
		ArgentinaVsColombia.agregarJugadorVisitante(jugador4);
		
		torneo.agregarPartido(ArgentinaVsColombia);
		
		
		assertEquals((Integer)4,torneo.cantidadDeIntegrantes());
		assertEquals((Integer)2,ArgentinaVsColombia.cantidadDeJugadoresLocal());
		assertEquals((Integer)2,ArgentinaVsColombia.cantidadDeJugadoresVisitante());
		assertEquals((Integer)1, torneo.cantidadDePartidos());
	}
	
	@Test 
	public void queInformeQuienGano() throws NoEsJugador {
		String nombreDelTorneo="copaAmerica";
		Torneo torneo= new Torneo(nombreDelTorneo);
		
		String equipo1="Argentina";
		String idDelPartido="1";
		String equipo2="Colombia";
		Partido ArgentinaVsColombia= new Partido(idDelPartido,equipo1,equipo2);

		String NyA="Gonzalo Montiel";
		String DNI="41.147.235";
		String posicion="DEF";
		Integer camiseta=4;
		Integrante jugador1= new Jugador(NyA,DNI,equipo1,posicion,camiseta);
		torneo.agregarIntegrante(jugador1);
		ArgentinaVsColombia.agregarJugadorLocal(jugador1);
		
		String NyA2="Guillermo Maripán";
		String DNI2="41.147.487";
		String posicion2="DEL";
		Integer camiseta2=5;
		Integrante jugador2= new Jugador(NyA2,DNI2,equipo1,posicion2,camiseta2);
		torneo.agregarIntegrante(jugador2);
		ArgentinaVsColombia.agregarJugadorLocal(jugador2);
		
		String NyA5="Lionel Scaloni";
		Integer edad=45;
		Integrante dt=new DT(NyA5,edad,equipo1);
		torneo.agregarIntegrante(dt);
		ArgentinaVsColombia.agregarJugadorLocal(dt);
		
		String NyA3="José María Giménez ";
		String DNI3="42.147.235";
		String posicion3="DEF";
		Integer camiseta3=6;
		Integrante jugador3= new Jugador(NyA3,DNI3,equipo2,posicion3,camiseta3);
		torneo.agregarIntegrante(jugador3);
		ArgentinaVsColombia.agregarJugadorVisitante(jugador3);
		
		String NyA4="Jean Meneses";
		String DNI4="41.481.487";
		String posicion4="DEL";
		Integer camiseta4=4;
		Integrante jugador4= new Jugador(NyA4,DNI4,equipo2,posicion4,camiseta4);
		torneo.agregarIntegrante(jugador4);
		ArgentinaVsColombia.agregarJugadorVisitante(jugador4);
		
		Double min=31.1;
		Gol primerGol= new Gol(jugador1,min,idDelPartido);
		ArgentinaVsColombia.agregarGolLocal();
		torneo.agregarGol(primerGol);
		
		Double min2=45.2;
		Gol segundoGol= new Gol(jugador4,min2, idDelPartido);
		ArgentinaVsColombia.agregarGolVisitante();
		torneo.agregarGol(segundoGol);
		
		
		torneo.agregarPartido(ArgentinaVsColombia);
		
	}

}
