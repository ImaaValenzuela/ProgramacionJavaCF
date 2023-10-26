package codigofacilito.java.desarrollojava.poo;

public class HerenciaMascota {

	public static void main(String[] args) {
		Perro perro = new Perro("Chino", "Sin raza", 2);
		Gato gato = new Gato ("Blanca", "Sin raza", 7);
		System.out.println(gato.nombre);
		System.out.println(perro.nombre);
		System.out.println(perro.dormir());
		System.out.println(perro.aumentarEdad());
	}

}
