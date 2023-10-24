package codigofacilito.java.desarrollojava.ciclos.ejercicios;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese su nota en una escala del 10 al 100: ");
		int nota = sc.nextInt();
		if(nota >= 70) {
			System.out.println("Aprobado");
		} else System.out.println("Reprobado");
		sc.close();
	}

}
