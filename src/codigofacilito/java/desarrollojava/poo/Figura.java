package codigofacilito.java.desarrollojava.poo;

public abstract class Figura {						// Pueden ser heredadaśpero no instanciadas
	
	private int numeroLados;
	
	public Figura() {
		this.numeroLados = 0;
	}
	
	public abstract float area();
}
