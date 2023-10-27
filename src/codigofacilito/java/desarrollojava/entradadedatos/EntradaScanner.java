package codigofacilito.java.desarrollojava.entradadedatos;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("¿Cual es tu edad?: ");
		int edad = sc.nextInt();
		System.out.println("Hola " + nombre + ", tu edad es de "+ edad + " años");
		sc.close();
	}

}
