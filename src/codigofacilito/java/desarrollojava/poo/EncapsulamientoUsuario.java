package codigofacilito.java.desarrollojava.poo;

public class EncapsulamientoUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.usuario = "Ima";
		usuario.setPassword("contra123");
		System.out.println(usuario.datosUsuario());
	}

}
