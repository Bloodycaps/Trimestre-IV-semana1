package co.edu.sena.actividadanimales.invertebrados;

public abstract class Sanguijuela extends Anelido {
	@Override
	public void reproducirse() {
		System.out.println("Me reporduzco de forma sexual interna");
	}

	@Override
	public void comer() {
		System.out.println("Soy hematofaga");
	}

	@Override
	public void desplazarse() {
		System.out.println("Me desplazo por agua");
	}

}
