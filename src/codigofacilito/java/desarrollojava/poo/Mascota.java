package codigofacilito.java.desarrollojava.poo;

public class Mascota {
	public String nombre;
	public String raza;
	public int edad;
	
	public Mascota (String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	public String dormir() {
		return "La mascota duerme";
	}
	
	public String aumentarEdad() {
		edad++;
		return "La mascota cumplio un año más";
	}
}
