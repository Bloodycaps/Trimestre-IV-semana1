package co.edu.sena.actividadanimales.invertebrados;

import co.edu.sena.actividadanimalesgeneral.Animales;

public abstract class Invertebrados extends Animales{
    @Override
	public void nacer(){
        System.out.println("Nazco de un huevo ");
    }
    public void proteccion() {
    }
    @Override
    public void respirar() {
    	System.out.println("Respiro de forma traquial");
    }
    @Override
    public void reproducirse() {
    	System.out.println("Me reproduzco de forma sexual externa");
    }
    
    
}
