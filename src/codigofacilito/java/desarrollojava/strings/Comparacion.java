package codigofacilito.java.desarrollojava.strings;

public class Comparacion {

	public static void main(String[] args) {
		
		String cadena1 = "Hola", cadena2 = "Hola", cadena3 = "  hola";
		boolean resultado;
		
		resultado = cadena1.equals(cadena2);
		System.out.println("La cadena 1 es igual a la cadena 2? " + resultado);
		
		resultado = cadena2.equals(cadena3);
		System.out.println("La cadena 2 es igual a la cadena 3? " + resultado);
		
		resultado = cadena2.equalsIgnoreCase(cadena3.trim());
		System.out.println("Al formatear las cadenas, la cadena 2 es igual a la cadena 3? " + resultado);
	}

}
