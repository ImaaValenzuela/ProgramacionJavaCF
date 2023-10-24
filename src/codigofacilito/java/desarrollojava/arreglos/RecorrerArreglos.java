package codigofacilito.java.desarrollojava.arreglos;

public class RecorrerArreglos {

	public static void main(String[] args) {

		int calificaciones[] = {9, 8, 7 , 10, 9, 5, 2, 7};
		double suma = 0;
		double promedio = 0;
		System.out.println("La cantidad de calificaciones que tiene es de: " + calificaciones.length); // length da la Longitud de elementos del arreglo
		
		for(int i = 0; i < calificaciones.length; i++) {
			suma += calificaciones[i];
			promedio = suma / calificaciones.length;
		}
		System.out.println("El promedio de las calificaciones es de: " + promedio);
	}

}
