package co.edu.sena.actividadanimales.invertebrados;

public abstract class LiebreDeMar extends Gasteropodos {
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo nadando");
	}

	@Override
	public void comer() {
		System.out.println("me alimento de Placton");
	}
}
