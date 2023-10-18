package codigofacilito.java.desarrollojava.introduccion;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// Operadores Aritmeticos
		int x = 40, y = 20;
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		
		int resultado;
		
		resultado = x + y;
		System.out.println("x + y: " + resultado);
		
		resultado = x - y;
		System.out.println("x - y: " + resultado);
		
		resultado = x * y;
		System.out.println("x * y: " + resultado);
		
		resultado = x / y;
		System.out.println("x / y: " +  resultado);
		
		x++; // Suma uno a la variable
		System.out.println("Nuevo valor de x: " + x);
		
		x -= 5; // Resta cinco a la variable
		System.out.println("Nuevo valor de x: " + x);
		
		x /= 2; // Divide por dos a la variable
		System.out.println("Nuevo valor de x: " + x);
	}

}
