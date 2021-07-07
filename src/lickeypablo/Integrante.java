package lickeypablo;

public class Integrante {
	private String NyA;
	private String equipo;
	

	public Integrante(String NyA, String equipo) {
		this.setNyA(NyA);
		this.equipo=equipo;
	}


	public String getNyA() {
		return NyA;
	}


	public void setNyA(String nyA) {
		NyA = nyA;
	}
	
}
