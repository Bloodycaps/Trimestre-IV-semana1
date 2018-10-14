package co.edu.sena.actividadanimales.invertebrados;

public abstract class Aracnidos extends Artropodos{
    public static final int PATAS=8;
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo en "+PATAS+" patas");
    }
    @Override
    public void comer() {
    	System.out.println("Soy Omnivoro");
    }
}
