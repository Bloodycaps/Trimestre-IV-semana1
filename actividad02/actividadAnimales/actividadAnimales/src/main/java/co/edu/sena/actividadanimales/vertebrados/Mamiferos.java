package co.edu.sena.actividadanimales.vertebrados;

public abstract class Mamiferos extends Vertebrados{
    @Override
    public void nacer(){
        System.out.println("Nazco del vientre de mi madre");
    }
    @Override
    public void comer(){
        System.out.println("Soy omnivoro");
    }
    @Override
    public void reproducirse(){
        System.out.println("Me reproduzco de forma sexual interna");
    }

}
