package codigofacilito.java.desarrollojava.poo;

public class Rol {
	public String username;
	
	public Rol (String username) {
		this.username = username;
	}
	
	public String designarRol() {
		Administrador admin = new Administrador();
		return "Rol designado, " + username + " es " + admin.rolDesignado();  
	}
	
	class Administrador{
		public String rolDesignado() {
			return "Admin";
		}
	}
}
