package co.edu.sena.actividadanimales.vertebrados;

public abstract class Anfibios extends Vertebrados {
    
    @Override
    public void comer(){
    	System.out.println("Como insectos");        
    }
    @Override
    public void desplazarse(){
    System.out.println("Me dezplazo en 4 patas");
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
