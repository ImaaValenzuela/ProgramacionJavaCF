package codigofacilito.java.desarrollojava.strings;

public class MetodosFormato {

	public static void main(String[] args) {
		
		String mensaje = "    Hola, soy un String";
		System.out.println(mensaje);
		
		String mensajeSinEspacio = mensaje.trim(); // Elimina espacios del inicio y del final
		System.out.println("Texto con trim: " + mensajeSinEspacio);
		
		String mensajeMayuscula = mensaje.toUpperCase(); // Pone el string en mayuscula
		System.out.println("Texto con upperCase: " + mensajeMayuscula.trim());
		
		String mensajeMinuscula = mensaje.toLowerCase(); // Pone el string en minuscula
		System.out.println("Texto con lowerCase: " + mensajeMinuscula.trim());
		
		String bienvenida = "";
		String curso = "Java";
		String mensaje2 = "";
		float valor = 105.2584f;
		
		bienvenida = String.format("Bienvenido al curso de %s", curso); // Permite darle formato a nuestro string
		System.out.println(bienvenida);
		
		mensaje2 = String.format("El total de los %d productos es de %.2f %s", 4, valor, "USD" );
		System.out.println(mensaje2);

	}

}
