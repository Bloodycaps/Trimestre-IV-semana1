package co.edu.sena.actividadanimales.invertebrados;

public abstract class Langosta extends Crustaceos {
	public static final int PATAS=8;
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo en "+PATAS+" Patas");
	}

}
