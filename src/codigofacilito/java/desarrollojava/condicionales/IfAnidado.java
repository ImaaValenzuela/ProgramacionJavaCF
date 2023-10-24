package codigofacilito.java.desarrollojava.condicionales;

public class IfAnidado {

	public static void main(String[] args) {
		int promedio = 4;
		
		if( promedio >= 7) {
			System.out.print("Aprobado, ");
			if (promedio == 10) {
				System.out.print("Muchas felicidades");
			} else System.out.print("Felicidades");
		} else System.out.print("Es necesario repasar bloques");
	}

}
