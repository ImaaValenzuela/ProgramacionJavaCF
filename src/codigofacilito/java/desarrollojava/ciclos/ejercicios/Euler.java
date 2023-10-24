package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class Euler {

	public static void main(String[] args) {
		// Crear un programa el cual nos permita conocer el valor de la constante e. 
		int n = 20;
		double eEstimado = 1.0;
		double factorial = 1.0;
		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			eEstimado += 1.0 / factorial;
		}
		
        System.out.println("El valor estimado de e es: " + eEstimado);
	}

}
