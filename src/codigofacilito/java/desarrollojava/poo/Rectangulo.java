package codigofacilito.java.desarrollojava.poo;

public class Rectangulo extends Figura{
	private float base;
	private float altura;
	
	public Rectangulo (float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
	@Override
	public float area() {
		return base * altura;
	}
}
