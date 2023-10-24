package codigofacilito.java.desarrollojava.arreglos;

public class InsertarRegistros {

	public static void main(String[] args) {
		
		int valores [] = new int [10];
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = i;
		}
		
		for(int i : valores) {
			System.out.println(i);
		}

	}

}
