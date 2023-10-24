package codigofacilito.java.desarrollojava.ciclos.ejercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// Dado un número saber si este es primo o no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroIngresado = sc.nextInt();
        
        if (numeroIngresado <= 1) {
            System.out.println("Su número no es primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < numeroIngresado; i++) {
                if (numeroIngresado % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println("Su número es primo.");
            } else {
                System.out.println("Su número no es primo.");
            }
        }

        sc.close();
    }
}
