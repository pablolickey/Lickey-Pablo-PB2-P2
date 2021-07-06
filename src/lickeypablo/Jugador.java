package lickeypablo;

public class Jugador extends Integrante implements Juega{

	private String DNI;
	private String equipo;
	private String posicion;

	public Jugador(String NyA, String DNI, String equipo, String posicion) {
		super(NyA, equipo);
		this.DNI=DNI;
		this.posicion=posicion;
	}

	@Override
	public void puedeJugar() {
	}

}
