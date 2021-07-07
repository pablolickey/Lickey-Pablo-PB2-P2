package lickeypablo;

public class Gol implements Comparable<Gol> {
	private Integrante jugador;
	private Double min;
	private String idPartido;
	private String timeStamp;

	public Gol(Integrante jugador, Double min, String idPartido, String timeStamp) {
		this.setJugador(jugador);
		this.setMin(min);
		this.setIdPartido(idPartido);
		this.setTimeStamp(timeStamp);
	}

	public String getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(String idPartido) {
		this.idPartido = idPartido;
	}

	public Integrante getJugador() {
		return jugador;
	}

	public void setJugador(Integrante jugador) {
		this.jugador = jugador;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gol other = (Gol) obj;
		if (timeStamp == null) {
			if (other.timeStamp != null)
				return false;
		} else if (!timeStamp.equals(other.timeStamp))
			return false;
		return true;
	}

	@Override
	public int compareTo(Gol otro) {
		return this.timeStamp.compareTo(otro.timeStamp);
	}

	
	
	
	
	
}
