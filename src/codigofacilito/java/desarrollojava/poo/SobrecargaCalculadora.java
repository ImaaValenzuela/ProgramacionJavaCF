package codigofacilito.java.desarrollojava.poo;

public class SobrecargaCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int sumaEnteros = calc.suma(10, 15, 7, 8, 14);
		System.out.println("El resultado de la suma de enteros es de: " + sumaEnteros);
		double sumaFlotantes = calc.suma(1.7, 14.2, 1.5, 10);
		System.out.println("El resultado de la suma de flotantes es de: " + sumaFlotantes);
		
	}

}
