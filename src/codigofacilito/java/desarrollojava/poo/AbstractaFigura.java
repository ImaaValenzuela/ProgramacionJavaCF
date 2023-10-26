package codigofacilito.java.desarrollojava.poo;

public class AbstractaFigura {

	public static void main(String[] args) {
		
		Figura figuras[] = new Figura[2];
		
		Figura cuadrado = new Cuadrado(2);					// Principio de sustitucion (Una clase hija puede ser tratada como una clase padre)
		Figura rectangulo = new Rectangulo(5,7);
		
		figuras[0] = cuadrado;
		figuras[1] = rectangulo;
		
		System.out.println("El área del cuadrado es: " + figuras[0].area());
		System.out.println("El área del rectángulo es: " + rectangulo.area());
	}

}
