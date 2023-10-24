package codigofacilito.java.desarrollojava.ciclos;

public class BreakFor {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Siguiente " + i + " : ");
			for (int j = 0; j < 20; j++) {
				if (j == 10) break;
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Ciclo terminado");
	}

}
