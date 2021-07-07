package lickeypablo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Torneo {

	private String nombreDelTorneo;
	private  Set<Integrante>integrantesDelTorneo=new HashSet<Integrante>();
	private Map<String,Partido>partidos=new HashMap<String,Partido>();
	private ArrayList<Gol>goles=new ArrayList<Gol>();

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

	public void agregarGol(Gol gol){
		this.goles.add(gol);
	}

}
