package codigofacilito.java.desarrollojava.poo;

public class Circulo {
	public static final float PI = 3.141592f; // Pertenece a la clase
	public float radio = 0;
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	public static float area(float radio) {
		return Circulo.PI * (radio * radio);
	}
}
