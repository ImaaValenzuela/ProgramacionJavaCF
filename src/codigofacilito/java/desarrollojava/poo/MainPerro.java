package codigofacilito.java.desarrollojava.poo;

public class MainPerro {

	public static void main(String[] args) {
		
		ObjetoPerro nicky = new ObjetoPerro("Nicky","Yorksire Terrier",4);

		System.out.println("El nombre es " + nicky.nombre + ", la raza es " + nicky.raza +" y la edad es " + nicky.edad);
	}

}
