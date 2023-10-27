package codigofacilito.java.patronesdiseño.poo;

public class Main {

	public static void main(String[] args) {
		Jaguar yagu = new Jaguar(4, 45);
		
		yagu.rugir();
		yagu.cazar();
		System.out.println(yagu.comer());
		System.out.println(yagu.dormir());
		yagu.maullar();
	}

}
