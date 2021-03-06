package lickeypablo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Partido {
	
	private String idDelPartido;
	private  Set<Integrante>local=new HashSet();
	private  Set<Integrante>visitante=new HashSet();	
	private String nombreLocal;
	private String nombreVisitante;
	private Integer golLocal=0;
	private Integer golVisitante=0;
	
	public Partido(String idDelPartido, String local, String visitante) {
		this.setIdDelPartido(idDelPartido);
		this.nombreLocal=local;
		this.nombreVisitante=visitante;
	}

	public void agregarJugadorLocal(Integrante jugador) throws NoEsJugador {
		if(jugador instanceof Jugador)this.local.add(jugador);
		else {
			throw new NoEsJugador();
		}
	}

	public void agregarJugadorVisitante(Integrante jugador) throws NoEsJugador {
		if(jugador instanceof Jugador)this.visitante.add(jugador);
		else {
			throw new NoEsJugador();
		}
	}

	public Integer cantidadDeJugadoresLocal() {
		return this.local.size();
	}

	public Integer cantidadDeJugadoresVisitante() {
		return this.visitante.size();
	}

	public String getIdDelPartido() {
		return idDelPartido;
	}

	public void setIdDelPartido(String idDelPartido) {
		this.idDelPartido = idDelPartido;
	}

	public void agregarGolLocal() {
		this.golLocal++;
	}

	public void agregarGolVisitante() {
		this.golVisitante++;
	}

	public String resultado() {
		if(this.golLocal>this.golVisitante)return "Gano Local";
		if(this.golLocal<this.golVisitante)return "Gano Visitante";
		else{
			return "Empate";
		}
	}


}

