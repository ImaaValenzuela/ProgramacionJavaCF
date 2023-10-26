package codigofacilito.java.desarrollojava.poo;

public class Cuadrado extends Figura{
	private float lado;
	
	public Cuadrado (float lado) {
		this.lado = lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}


	@Override
	public float area() {
		return lado * lado;
	}
}
