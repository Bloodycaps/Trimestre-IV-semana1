package co.edu.sena.actividadanimales.invertebrados;

public abstract class Miriapodos extends Artropodos{
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo con muchas patas");
    }
    @Override
    public void comer() {
    	System.out.println("Soy saprofago");
    }
}
