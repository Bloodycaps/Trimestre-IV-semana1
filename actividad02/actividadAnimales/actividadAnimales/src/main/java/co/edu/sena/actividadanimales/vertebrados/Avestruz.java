package co.edu.sena.actividadanimales.vertebrados;

public abstract class Avestruz extends Aves{
    @Override
    public void comer(){
        System.out.println("Soy hervivoro");
    }
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo en 2 patas");
    }    
}
