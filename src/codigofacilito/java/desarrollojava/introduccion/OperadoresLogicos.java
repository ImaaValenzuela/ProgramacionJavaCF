package codigofacilito.java.desarrollojava.introduccion;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean resultado;

		resultado = 5 <= 5 && 1 >= 1; // and (y) todos los resultados tienen que ser verdaderos para que sea true
		System.out.println("Comparacion AND: " + resultado);

		resultado = 4 < 5 || false; // or (o) al menos uno de los dos resultados tiene que ser verdadero para que
									// sea true, si los dos son true, retorna el primero
		System.out.println("Comparacion OR: " + resultado);

		resultado = (5 >= (2 * 3) || true) && (true && 10 > 5);
		System.out.println("Comparacion AND y OR: " + resultado);

		System.out.println(!true); // not (no) el resultado verdadero cuando el operador es falso y viceversa, el
									// resultado es falso cuando el operador sea verdadero
		System.out.println(!false);
	}

}
