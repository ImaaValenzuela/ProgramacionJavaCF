package codigofacilito.java.desarrollojava.poo;

public class RetornarValores {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		triangulo.altura = 10;
		triangulo.base = 12;
		
		float resultado = triangulo.area();
		System.out.println("El resultado es: " + resultado);
	}

}
