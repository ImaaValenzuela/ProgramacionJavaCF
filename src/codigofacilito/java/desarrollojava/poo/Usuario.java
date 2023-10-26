package codigofacilito.java.desarrollojava.poo;

public class Usuario {
	public String usuario;
	private String password;
	// Default -> Cualquier clase y objeto puede hacer uso del atributo
	// Public -> Se puede acceder 
	// Private -> Otros objetos o clases no pueden acceder a el, solo puede ser utilizado en la misma clase
	// Protected
	
	// Constructor 					
					// Sobrecarga de constructor
	public Usuario () {
		
	}
	public Usuario(String usuario, String password) {			
		this.usuario = usuario;
		this.password = password;
	}
	
	// Getters -> Ayudan a acceder a atributos privados sin necesidad de acceder directamente a el
	public String getPassword() {
		return this.password;
	} 
	
	// Setters -> Nos permite dar un valor a un atributo
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Metodos
	public String datosUsuario() {
		return "Usuario: " + usuario + "\nContraseña: " + password;
	}
	
}

