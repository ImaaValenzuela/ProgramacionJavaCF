package codigofacilito.java.desarrollojava.ciclos.ejercicios;

import java.util.Scanner;

public class Ascendentes {

	public static void main(String[] args) {
		// Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese tres números");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		

        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println("El orden ascendente de sus números es: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 <= numero3 && numero3 <= numero2) {
            System.out.println("El orden ascendente de sus números es: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if (numero2 <= numero1 && numero1 <= numero3) {
            System.out.println("El orden ascendente de sus números es: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 <= numero3 && numero3 <= numero1) {
            System.out.println("El orden ascendente de sus números es: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero3 <= numero1 && numero1 <= numero2) {
            System.out.println("El orden ascendente de sus números es: " + numero3 + ", " + numero1 + ", " + numero2);
        } else {
            System.out.println("El orden ascendente de sus números es: " + numero3 + ", " + numero2 + ", " + numero1);
        }
		sc.close();
	}

}
