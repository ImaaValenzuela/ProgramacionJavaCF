package codigofacilito.java.desarrollojava.ciclos;

public class While {

	public static void main(String[] args) {
		int contador = 0;
		int numero = 25043;
		int contador2 = 0;
		
		while (contador < 11) {
			System.out.println(contador);
			contador++;
		}
		
		while (numero > 0) {
			numero = numero / 10;
			contador2++;
		}
		System.out.println("El número posee " + contador2 + " digitos.");
	}

}
