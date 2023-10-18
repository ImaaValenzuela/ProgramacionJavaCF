package codigofacilito.java.desarrollojava.introduccion;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		int variable1 = 10, variable2 = 20, variable3 = 10;
		System.out.println("Variable 1: " + variable1);
		System.out.println("Variable 2: " + variable2);
		System.out.println("Variable 3: " + variable3);
		boolean resultado;
		
		resultado = variable1 > variable2; // Mayor
		System.out.println("La variable 1 es mayor a la variable 2? " + resultado);
		
		resultado = variable1 == variable3; // Igual
		System.out.println("La variable 1 es igual a la variable 3? " + resultado);
		
		resultado = variable3 != variable2; // Diferente
		System.out.println("La variable 3 es diferente a la variable 2? " + resultado);
		
	}

}
