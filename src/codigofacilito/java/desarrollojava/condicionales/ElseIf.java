package codigofacilito.java.desarrollojava.condicionales;

public class ElseIf {

	public static void main(String[] args) {
		
		String colorLuz = "Amarillo";
		
		if(colorLuz.equalsIgnoreCase("verde")) {
			System.out.println("Puede avanzar");
		} else if (colorLuz.equalsIgnoreCase("amarillo")) {
			System.out.println("Disminuya velocidad");
		} else if (colorLuz.equalsIgnoreCase("rojo")){
			System.out.println("Detengase");
		} else {
			System.out.println("Color no valido");
		}
	}

}
