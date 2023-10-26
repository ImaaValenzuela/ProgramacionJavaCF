package codigofacilito.java.desarrollojava.poo;

public class Calculadora {
	
	// Sobrecarga de Metodos 
	
	public int suma(int... numeros) { //n -> int (es un arreglo)
		int suma = 0;
		for(int numero: numeros)
			suma += numero;
		return suma;
	}
	
	public double suma(double... numeros) { //n -> int (es un arreglo)
		double suma = 0;
		for(double numero: numeros)
			suma += numero;
		return suma;
	}

}
