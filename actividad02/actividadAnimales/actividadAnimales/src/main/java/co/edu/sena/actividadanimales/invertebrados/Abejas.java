package co.edu.sena.actividadanimales.invertebrados;

public abstract class Abejas extends Insectos {
	@Override
	public void desplazarse() {
		System.out.println("Me Desplazo Volando");
		System.out.println("Me desplazo con "+PATAS+" patas");
	}
	@Override
	public void comer() {
		System.out.println("Me alimento de polen");
	}
	

}
