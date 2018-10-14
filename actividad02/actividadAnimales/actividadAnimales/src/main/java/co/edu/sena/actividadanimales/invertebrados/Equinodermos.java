package co.edu.sena.actividadanimales.invertebrados;

public abstract class Equinodermos extends ConProteccion {
	@Override
	public void proteccion() {
		System.out.println("Tengo espinas, placas");
	}

	@Override
	public void desplazarse() {
		System.out.println("Me desplazo arrastrandome");
	}
}
