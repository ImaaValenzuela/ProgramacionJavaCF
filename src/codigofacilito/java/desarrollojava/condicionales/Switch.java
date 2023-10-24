package codigofacilito.java.desarrollojava.condicionales;

public class Switch {

	public static void main(String[] args) {
		
		String colorLuz = "azul";
		
		switch(colorLuz){
		case "Verde":
			System.out.println("Puede avanzar");
			break;
		case "Amarillo":
			System.out.println("Disminuya la velocidad");
			break;
		case "Rojo":
			System.out.println("Detengase");
			break;
		default:
			System.out.println("Color incorrecto");
		}
	}

}
