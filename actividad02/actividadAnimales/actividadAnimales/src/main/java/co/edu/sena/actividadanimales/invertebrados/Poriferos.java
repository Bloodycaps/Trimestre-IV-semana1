package co.edu.sena.actividadanimales.invertebrados;

public abstract class Poriferos extends SinProteccion {
	@Override
	public void comer() {
		System.out.println("Me alimento de nutrientes del agua");
	}

	@Override
	public void desplazarse() {
		System.out.println("No me desplazo");
	}

}
