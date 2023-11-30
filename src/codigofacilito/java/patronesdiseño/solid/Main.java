package codigofacilito.java.patronesdiseño.solid;

public class Main {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		Teclado teclado = new Teclado();
		Computadora computadora = new Computadora(teclado, mouse);
		computadora.encender();
	}

}
