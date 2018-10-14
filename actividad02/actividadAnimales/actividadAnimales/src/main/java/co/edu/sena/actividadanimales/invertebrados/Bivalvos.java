package co.edu.sena.actividadanimales.invertebrados;

public abstract class Bivalvos extends Moluscos {
	@Override
	public void proteccion() {
		System.out.println("Tengo una Concha de dos piezas");
	}

	@Override
	public void comer() {
		System.out.println("Me alimento de Placton");
	}

	@Override
	public void desplazarse() {
		System.out.println("Me desplazo Arrastrandome");
	}
}
