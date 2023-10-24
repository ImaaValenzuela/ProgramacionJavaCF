package codigofacilito.java.desarrollojava.arreglos;

public class Arreglos {

	public static void main(String[] args) {
		
		String nombres[]; // Declaracion
		nombres = new String[3]; // Inicializacion
		
		nombres[0] = "Imanol"; // Insertar y/o modificar elemento
		nombres[1] = "Jose";
		nombres[2] = "Zoe";
		nombres[1] = "Josefina";
		
		System.out.println(nombres[0]); // Lectura mediante indices
		System.out.println(nombres[1]); // Lectura mediante indices
		System.out.println(nombres[2]); // Lectura mediante indices
		
		String usuarios[] = new String[1]; // Declaracion e inicializacion
		usuarios[0] = "ImaaValenzuela";
		
		System.out.println(usuarios[0]);
		 
		String nicknames[] = {"Truelove", "Enlighted", "ENLTDxLUV"}; // Declaracion, incializacion e insercion de datos
		
		System.out.println(nicknames[2]);

	}

}
