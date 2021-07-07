package lickeypablo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Torneo {

	private String nombreDelTorneo;
	private  Set<Integrante>integrantesDelTorneo=new HashSet<Integrante>();
	private Map<String,Partido>partidos=new HashMap<String,Partido>();
	private TreeSet<Gol>goles=new TreeSet<Gol>();

	public Torneo(String nombreDelTorneo) {
		 this.nombreDelTorneo=nombreDelTorneo;
	}

	public boolean agregarIntegrante(Integrante integrante) {
		return this.integrantesDelTorneo.add(integrante);
	}

	public Integer cantidadDeIntegrantes() {
		return this.integrantesDelTorneo.size();
	}

	public void agregarPartido(Partido partido) {
		partidos.put(partido.getIdDelPartido(),partido);
	}

	public Integer cantidadDePartidos() {
		return partidos.size();
	}

	public boolean agregarGol(Gol gol, Partido partido, Integrante jugador) throws JugadorNoEncontradoException{
		if(partido.cantidadDeJugadoresLocal() != 0 && partido.cantidadDeJugadoresVisitante() !=0 && jugador != null) {			
			this.goles.add(gol);
			return true;
		}
		else {
			throw new JugadorNoEncontradoException(); 
		}
	}

	public Integer cantidadDeGoles() {
		return this.goles.size();
	}

	public Integrante buscarJugador(Integrante miembro, String idPartido) {
		Partido partido=this.partidos.get(idPartido);
		Integrante jugadorLocal=partido.buscarJugadorLocal(miembro);
		Integrante jugadorVisitante=partido.buscarJugadorVisitante(miembro);
		if(jugadorLocal != null)return jugadorLocal;
		if(jugadorVisitante != null)return jugadorVisitante;
		return null;
	}

	public TreeSet<Gol> mostrarGoles() {
		return this.goles;
	}

}
