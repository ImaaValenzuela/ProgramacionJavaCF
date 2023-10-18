package codigofacilito.java.desarrollojava.introduccion;

public class OperadorTernario {

	public static void main(String[] args) {

		String mensaje = 10 > 9 ? "Es mayor" : "Es menor"; // Primero compara un resultado booleano, si es true, retorna
															// el primer valor, si es false, el segundo. Tanto la
															// segunda como la tercera expresion deben ser del mismo
															// tipo que de la variable donde se aloja este operador
		System.out.println(mensaje);

	}

}
