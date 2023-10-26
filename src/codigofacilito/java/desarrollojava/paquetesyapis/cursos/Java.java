package codigofacilito.java.desarrollojava.paquetesyapis.cursos;

public class Java {
	private final String titulo;
	
	public Java() {
		this.titulo = "Desarrollo Java";
	}
	
	protected String getTitulo() {			/// Este modificador nos permite usar metodos en el mismo paquete
		return this.titulo;
	}
	
	public String getTituloPublico() {			/// Este modificador nos permite usar metodos en el mismo paquete
		return this.titulo + " publico";
	}
}
