package lickeypablo;

public class DT extends Integrante implements Dirige{

	private Integer edad;

	public DT(String NyA, Integer edad, String equipo) {
		super(NyA,equipo);
		this.edad=edad;
		
	}

	@Override
	public void puedeDirigir() {
	}

}
