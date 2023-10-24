package codigofacilito.java.desarrollojava.condicionales;

public class Scope {

	public static void main(String[] args) {
		
		int promedio = 8; // Variable global 
		
		if (promedio >= 7) {
			String mensaje = "Felicidades, su promedio es de " + promedio; // Variable local
			System.out.println(mensaje);
		} else {
			String mensaje = "Su promedio es de " + promedio + " , siga esforzandose!";
			System.out.println(mensaje);
		}
	}

}
