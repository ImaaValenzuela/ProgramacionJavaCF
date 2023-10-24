package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class SerieFibonacci {

	public static void main(String[] args) {
		// Imprimir en consola los primero diez números de la serie Fibonacci.
		int n  = 10;
		int primerNumero = 0;
		int segundoNumero = 1;
		
		System.out.println("Los primeros " +  n + " numeros de la serie de Fibonacci son: ");
		
		for (int i = 1; i <= n; i++) {
			System.out.print(primerNumero + ", ");
			int siguienteNumero = primerNumero + segundoNumero;
			primerNumero = segundoNumero;
			segundoNumero = siguienteNumero;
		}
	}

}
