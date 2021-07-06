package lickeypablo;

public class Jugador extends Integrante implements Juega{

	private String DNI;
	private String equipo;
	private String posicion;
	private Integer camiseta;

	public Jugador(String NyA, String DNI, String equipo, String posicion, Integer camiseta) {
		super(NyA, equipo);
		this.DNI=DNI;
		this.posicion=posicion;
		this.camiseta=camiseta;
	}

	@Override
	public void puedeJugar() {
	}

}
