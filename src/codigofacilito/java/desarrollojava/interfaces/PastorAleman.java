package codigofacilito.java.desarrollojava.interfaces;

public class PastorAleman implements Canino, Mascota{
	@Override
	public void aullar() {
		System.out.println("El pastor aleman aulla");
	}

	@Override
	public void comer() {
		System.out.println("El pasto aleman come");
	}
}
