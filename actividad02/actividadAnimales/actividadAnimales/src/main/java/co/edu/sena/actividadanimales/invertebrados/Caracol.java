package co.edu.sena.actividadanimales.invertebrados;

public abstract class Caracol extends Gasteropodos {
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo por la tierra Arrastrandome");
	}

	@Override
	public void comer() {
		System.out.println("Soy herviboro");
	}
}
