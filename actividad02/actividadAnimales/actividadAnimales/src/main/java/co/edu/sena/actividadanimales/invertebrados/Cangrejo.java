package co.edu.sena.actividadanimales.invertebrados;

public abstract class Cangrejo extends Crustaceos {
	public static final int PATAS=10;
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo en "+PATAS+" patas");
	}

}
