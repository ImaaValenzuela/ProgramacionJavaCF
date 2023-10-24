package codigofacilito.java.desarrollojava.arreglos;

public class ForEach {

	public static void main(String[] args) {
		
		int calificaciones[] = {7, 8, 9, 10, 5, 9};
		double suma = 0;
		double promedio = 0;
		
		for (int i  : calificaciones) {
			suma += i;
			promedio = suma / calificaciones.length;
		}
		System.out.println("El promedio de las calificaciones es de: " + promedio);
	}

}
