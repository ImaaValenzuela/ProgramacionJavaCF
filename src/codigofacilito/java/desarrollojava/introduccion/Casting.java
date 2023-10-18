package codigofacilito.java.desarrollojava.introduccion;

public class Casting {

	public static void main(String[] args) {

		int x = 10;
		float z = 5.5f;
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de z: " + z);

		int resultadoInt;
		float resultadoFloat;

		resultadoInt = x + (int) z; // Se convierte z en int y pierde el decimal (conversion explicita)
		System.out.println("Suma de enteros\nx + z: " + resultadoInt);

		resultadoFloat = x - z; // Java convierte automaticamente x en un float para resolver la operacion
								// (conversion implicita)
		System.out.println("Resta de decimales\nx - z: " + resultadoFloat);

	}

}
