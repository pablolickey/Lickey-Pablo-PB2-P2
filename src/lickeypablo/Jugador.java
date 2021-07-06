package lickeypablo;

public class Jugador extends Integrante implements Juega{

	private String DNI;
	private String equipo;
	private String posicion;

	public Jugador(String NyA, String DNI, String equipo, String posicion) {
		super(NyA);
		this.DNI=DNI;
		this.equipo=equipo;
		this.posicion=posicion;
	}

	@Override
	public void puedeJugar() {
	}

}
