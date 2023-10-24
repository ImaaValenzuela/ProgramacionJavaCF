package codigofacilito.java.desarrollojava.arreglos.ejercicios;

import java.util.Arrays;

public class ArregloCien {

	public static void main(String[] args) {
		// Crear un arreglo cual nos permita almacenar cien números enteros.
		int arreglo [] = new int [100];
		
		// Llenar el arreglo con números aleatorios.
		for (int i = 0; i< arreglo.length; i++) {
			int numero = (int)(Math.random() * 101);
			arreglo[i] = numero;
			System.out.println("Posicion " + i + " = " + numero);
		}

		// Mostrar en consola el número mayor.
		int max = arreglo[0];
		
		for (int i = 1; i < arreglo.length; i++) {
			if(arreglo[i] > max) max = arreglo[i];
		}
		System.out.println("El número mayor es: " + max);
		
		// Mostrar en consola el número menor.
		int min = arreglo[0];
		
		for (int i = 1; i < arreglo.length; i++) {
			if(arreglo[i] < min) min = arreglo[i];
		}
		System.out.println("El número menor es: " + min);
		
		// Mostrar en consola todos los números primos.
		System.out.println("Números primos en el arreglo: ");
		for (int i = 0; i < arreglo.length; i++) {
		    int numero = arreglo[i];
		    boolean esPrimo = true;

		    if (numero <= 1) {
		        esPrimo = false;
		    } else {
		        for (int j = 2; j * j <= numero; j++) {
		            if (numero % j == 0) {
		                esPrimo = false;
		                break;
		            }
		        }
		    }

		    if (esPrimo) {
		        System.out.print(numero + " ");
		    }
		}
		
		// Mostrar en consola todos los números pares.
		System.out.println();
		System.out.println("Números pares en el arreglo: ");
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] % 2 == 0) {
				System.out.print(arreglo[i] + " ");
			}
		}
		
		// Mostrar en consola el arreglo de forma ascendente.
		System.out.println();
		Arrays.sort(arreglo);
		System.out.println("Arreglo en orden ascendente" + Arrays.toString(arreglo));
		
		// Mostrar en consola el promedio del arreglo.
		double promedio = 0;
		for(int num : arreglo) {
			promedio += num;
		}
		promedio /= arreglo.length;
		System.out.println("El promedio del arreglo es: " + promedio);
		
		// Mostrar en consola la suma del primer y último elemento del arreglo.
		int sumaExtremos = arreglo[0] + arreglo[arreglo.length - 1];
		System.out.println("La suma del primer y último elemento del arreglo es: " + sumaExtremos);
		
		// Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.
        boolean contieneCien = false;
        for (int num : arreglo) {
            if (num == 100) {
                contieneCien = true;
                break;
            }
        }
        if (contieneCien) {
            System.out.println("Existe al menos un cien en el arreglo.");
        } else {
            System.out.println("No existe ningún cien en el arreglo.");
        }
		
	}

}
