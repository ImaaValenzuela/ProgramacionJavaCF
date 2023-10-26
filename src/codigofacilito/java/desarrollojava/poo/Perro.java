package codigofacilito.java.desarrollojava.poo;

public class Perro extends Mascota{
	public Perro (String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}
	
	@Override						// Sobreescritura de metodo
	public String dormir() {
		return nombre + " duerme";
	}
	
	@Override
	public String aumentarEdad() {
		super.aumentarEdad(); // Permite sobreescribir metodos sin que se pierda la funcionalidad del metodo padre
		return nombre + " ahora tiene " + edad + " años";
	}
}
