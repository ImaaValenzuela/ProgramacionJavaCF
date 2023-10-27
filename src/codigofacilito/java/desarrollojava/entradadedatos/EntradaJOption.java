package codigofacilito.java.desarrollojava.entradadedatos;

import javax.swing.JOptionPane;

public class EntradaJOption {
	
	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog(null, "Define el nombre de usuario");
		String contrasenia = JOptionPane.showInputDialog(null, "Define la contraseña");
		JOptionPane.showMessageDialog(null, "Cuenta creada con exito\nBienvenido " + usuario +"\nRecuerda tu contraseña: " + contrasenia);
	}
}
