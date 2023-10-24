package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class TablaNueve {

	public static void main(String[] args) {
		// Imprimir en consola la tabla de multiplicar del número 9.
		for (int i = 1; i < 11; i++) {
			int numero = 9;
			int resultado = numero * i;
			String mensaje = numero + " x " + i + " = " + resultado;
			System.out.println(mensaje);
		}
	}

}
