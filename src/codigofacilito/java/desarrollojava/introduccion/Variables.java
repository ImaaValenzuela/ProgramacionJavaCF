package codigofacilito.java.desarrollojava.introduccion;

public class Variables {

	public static void main(String[] args) {
		/*4 Tipos de datos
		 * - Caracteres: char
		 * - Enteros: byte, short, int, long
		 * - Decimales: float, double
		 * - Booleanos: boolean
		 * */
		
		int version; // Declaracion de variable tipo entero
		version = 10; // Asignacion de la variable
		System.out.println(version);
		version = 11;
		System.out.println(version);
		
		float versionJava = 11.25f; // Declaracion y asignacion (Uso de camelCase)
		System.out.println(versionJava);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		
		int variable1, variable2, variable3; // Declaracion de multiples variables (SIEMPRE DEL MISMO TIPO)
		variable1 = 1;
		variable2 = 2;
		variable3 = 3;
		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(variable3);
		
		final float PI = 3.14f; // Constante (Uso de SNAKE_CASE)
		System.out.println(PI);
	}

}
