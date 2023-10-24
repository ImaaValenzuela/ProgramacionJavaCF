package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class Consola2 {

	public static void main(String[] args) {
		/*
		 * Replicar la siguiente salida en consola.
						     *
						    ***
						   *****
						  *******
						 *********
		 */
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <=  2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
