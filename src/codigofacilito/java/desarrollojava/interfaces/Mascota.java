package codigofacilito.java.desarrollojava.interfaces;

public interface Mascota {
	public void comer();
	public default void crece() {							// Metodo que posee comportamiento
		System.out.println("La mascota crece");
	};
}
