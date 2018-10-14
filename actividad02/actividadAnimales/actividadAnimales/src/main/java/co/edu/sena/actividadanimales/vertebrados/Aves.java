package co.edu.sena.actividadanimales.vertebrados;

public abstract class Aves extends Vertebrados{
    @Override
    public void desplazarse(){
    	System.out.println("Me desplazo volando");        
    }
    @Override
    public void reproducirse(){
        System.out.println("Me de forma sexual externa");
    }
    @Override
    public void nacer(){
        System.out.println("Nazco de un huevo");
    }   
    
    
}
