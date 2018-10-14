package co.edu.sena.actividadanimales.invertebrados;

public abstract class Celentereos extends SinProteccion {
	@Override
	public void respirar() {
		System.out.println("Respiro de forma braquial");
	}

	@Override
	public void comer() {
		System.out.println("Me alimento Absorviendo a mis presas");
	}
}
