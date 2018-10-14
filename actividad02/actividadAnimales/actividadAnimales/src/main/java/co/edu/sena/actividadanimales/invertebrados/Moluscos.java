package co.edu.sena.actividadanimales.invertebrados;

public abstract class Moluscos extends ConProteccion{
	@Override
	public void proteccion() {
		System.out.println("Tengo concha");
	}
	@Override
	public void respirar() {
		System.out.println("respiro de forma braquial");
	}
    
}
