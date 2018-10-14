package co.edu.sena.actividadanimales.invertebrados;

public abstract class Cienpies extends Miriapodos {
	public static final int PATAS=100;
	
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo con "+PATAS+" patas");
	}

}
