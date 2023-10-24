package codigofacilito.java.desarrollojava.ciclos;

public class For {

	public static void main(String[] args) {
		
		for(int x = 1; x < 11 ; x++) {
			int numero = 7;
			int resultado = numero * x;
			String mensaje = numero + " x " + x + " = " + resultado;
			System.out.println(mensaje);
		}
		
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
