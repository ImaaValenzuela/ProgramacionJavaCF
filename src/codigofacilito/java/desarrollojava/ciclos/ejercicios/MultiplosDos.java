package codigofacilito.java.desarrollojava.ciclos.ejercicios;

public class MultiplosDos {

	public static void main(String[] args) {
		// Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570
		for (int i = 1; i < 4570; i++) {
			if (i % 2 == 0) System.out.println(i);
		}

	}

}
