package codigofacilito.java.desarrollojava.strings;

public class Metodos {

	public static void main(String[] args) {

		String bienvenida = "Bienvenido usuario nuevo"; // Los Strings son clases
		System.out.println(bienvenida);
		
		int cantidadCaracteres = bienvenida.length(); // length cuenta los caracteres del string, toma en cuenta los espacios
		System.out.println("Cantidad de caracteres que posee el mensaje: " + cantidadCaracteres);
		
		boolean contiendeCaracteres = bienvenida.contains("veni"); // contains verifica si un string contiene texto y retorna un bool
		System.out.println("La palabra contiene los caracteres? " + contiendeCaracteres);
		
		boolean comienzaCon = bienvenida.startsWith("Bienvenido"); // startsWith verifica si el string comienza con ciertos caracteres
		System.out.println("Comienza con esa palabra? " + comienzaCon);
		
		boolean terminaCon = bienvenida.endsWith("usuario"); // endsWith verifica si el string termina con ciertos caracteres
		System.out.println("Termina con esa palabra? " + terminaCon);
		
		String nuevaBienvenida = bienvenida.concat(", disfruta tu paseo en mi codigo!"); // concat agrega caracteres a un string generando uno nuevo
		System.out.println("Bienvenida actualizada");
		System.out.println(nuevaBienvenida);
	}

}
