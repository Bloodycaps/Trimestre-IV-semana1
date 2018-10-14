package co.edu.sena.actividadanimales.vertebrados;

public abstract class Peces extends Vertebrados{
    @Override
    public void respirar(){
        System.out.println("Respiro de forma branquial");
    }
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo nadando");
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
