package codigofacilito.java.desarrollojava.arreglos;

public class ArreglosMultidimensionales {

	public static void main(String[] args) {
		
		int calificaciones[][] = new int[3][];
		
		calificaciones[0] = new int [1];
		calificaciones[1] = new int [2];
		calificaciones[2] = new int [3];
		
		calificaciones[0][0] = 8;
		
		calificaciones[1][0] = 8;
		calificaciones[1][1] = 7;
		
		calificaciones[2][0] = 5;
		calificaciones[2][1] = 8;
		calificaciones[2][2] = 8;
		
		for(int [] calificacionesPorAlumno : calificaciones) {
			for(int calificacion : calificacionesPorAlumno) {
				System.out.println("La calificacion es de: " + calificacion);
			}
			System.out.println();
		}
		
	}

}
