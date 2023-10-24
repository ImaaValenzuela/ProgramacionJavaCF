package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class Consola {

	public static void main(String[] args) {
		/*
		 * Replicar la siguiente salida en consola.
		 	*
		 	**
		 	***
		 	****
		 	*****
		 	****** 
		 */
		for (int i = 1; i < 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
