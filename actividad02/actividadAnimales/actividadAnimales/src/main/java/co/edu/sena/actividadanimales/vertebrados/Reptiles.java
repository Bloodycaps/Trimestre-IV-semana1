package co.edu.sena.actividadanimales.vertebrados;

public abstract class Reptiles extends Vertebrados{
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo arrastrandome ");
    }
    @Override
    public void reproducirse(){
        System.out.println("Me reproduzco de forma sexual externa");
    }
    @Override
    public void nacer(){
        System.out.println("Nazco de un huevo");
    }
    
}
