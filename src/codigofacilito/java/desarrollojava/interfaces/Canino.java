package codigofacilito.java.desarrollojava.interfaces;

public interface Canino extends Mascota {				// En lasint erfaces solo van a haber metodos abstractos y constantes. 
	public void aullar(); // No hace falta definirla como abstract
	public default void crece() {
		System.out.println("El canino crece");
	}
}
