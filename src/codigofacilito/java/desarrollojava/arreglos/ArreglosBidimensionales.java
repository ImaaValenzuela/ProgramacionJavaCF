package codigofacilito.java.desarrollojava.arreglos;

public class ArreglosBidimensionales {

	public static void main(String[] args) {
		
		int matriz[][] = new int [3][3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 3;
		matriz[1][1] = 2;
		matriz[1][2] = 1;
		
		matriz[2][0] = 1;
		matriz[2][1] = 2;
		matriz[2][2] = 3;
		
		/* for(int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				System.out.println("Posicion" +" " + x + y + " : "+ matriz[x][y]);
			}
		} */
		
		for (int[] x : matriz) {
			for (int y : x) {
				System.out.println("Posicion: " + y);
			}
		}
	}

}
