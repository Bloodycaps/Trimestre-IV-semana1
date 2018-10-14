package co.edu.sena.actividadanimales.invertebrados;

public abstract class Cefalopodos extends Moluscos {
	@Override
	public void proteccion() {
		System.out.println("No tengo Concha Externa");
	}
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo nadando");
	}
}
