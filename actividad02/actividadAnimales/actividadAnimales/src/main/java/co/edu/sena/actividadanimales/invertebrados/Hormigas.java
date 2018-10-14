package co.edu.sena.actividadanimales.invertebrados;

public abstract class Hormigas extends Insectos {
	@Override
	public void desplazarse() {
		System.out.println("Me desplazo por tierra");
		System.out.println("Me desplazo con "+PATAS+" patas");
	}
	@Override
	public void comer() {
		System.out.println("Soy hervivora");
	}
}
