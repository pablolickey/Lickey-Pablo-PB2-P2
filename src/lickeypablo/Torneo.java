package lickeypablo;

import java.util.HashSet;
import java.util.Set;

public class Torneo {

	private String nombreDelTorneo;
	private  Set<Integrante>integrantesDelTorneo=new HashSet<Integrante>();

	public Torneo(String nombreDelTorneo) {
		 this.nombreDelTorneo=nombreDelTorneo;
	}

	public boolean agregarIntegrante(Integrante integrante) {
		return this.integrantesDelTorneo.add(integrante);
	}

	public Integer cantidadDeIntegrantes() {
		return this.integrantesDelTorneo.size();
	}

}
