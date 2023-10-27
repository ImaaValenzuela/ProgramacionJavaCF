package codigofacilito.java.patronesdiseño.poo;

public class Jaguar extends Animal implements IFelino {
	
	// Atributos
	
	private double peso;
	private int edad;
	
	public Jaguar() {
		setEdad(0);
		setPeso(0);
	}
	
	
	// Constructores
	
	public Jaguar(int edad) {
		setEdad(edad);
		setPeso(0);
	}
	
	public Jaguar(double peso) {
		setEdad(0);
		setPeso(peso);
	}
	
	public Jaguar(int edad, double peso) {
		setEdad(edad);
		setPeso(peso);
	}
	
	
	// Metodos
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodos herencia
	
	@Override
	public String dormir() {
		return "El jaguar duerme";
	}
	
	@Override
	public String comer() {
		return "El jaguar come";
	}
	
	// Metodos interfaz
	
	@Override
	public void rugir() {
		System.out.println("El jaguar ruge");
	}
	
	@Override
	public void maullar() {
		throw new Error("El jaguar no maulla");
	}


	@Override
	public void cazar() {
		System.out.println("El jaguar caza");
	}
}

