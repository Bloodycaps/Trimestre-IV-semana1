package co.edu.sena.actividadanimales.invertebrados;

public abstract class Crustaceos extends Artropodos {
	@Override
	public void respirar() {
		System.out.println("Respiro de Forma braquial");
	}

	@Override
	public void comer() {
		System.out.println("Soy omnivoro");
	}
}
