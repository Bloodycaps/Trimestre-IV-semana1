package co.edu.sena.actividadanimales.invertebrados;

public abstract class Milpies extends Miriapodos {
	public static final int PATAS = 1000;

	@Override
	public void desplazarse() {
		System.out.println("Me desplazo con " + PATAS + " patas");
	}
}
