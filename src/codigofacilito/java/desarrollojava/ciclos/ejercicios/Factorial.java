package codigofacilito.java.desarrollojava.ciclos.ejercicios;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Dado un número entero obtener su factorial.
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese un número para obtener su factorial: ");
		int numeroIngresado = sc.nextInt();
		if (numeroIngresado < 0) {
			System.out.println("El factorial de un número negativo no está definido");
		} else {
			int factorial = 1;
			for (int i = 1; i <= numeroIngresado; i++) {
				factorial *= i;
			}
			 System.out.println("El factorial de " + numeroIngresado + " es " + factorial);
		}
		sc.close();

	}

}
