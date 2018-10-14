package co.edu.sena.actividadanimales.vertebrados;

public abstract class Tortuga extends Reptiles {
    @Override
    public void comer(){
        System.out.println("Soy Hervivoro");
    }
    @Override
    public void reproducirse(){
        System.out.println("Me reproduzco de forma sexual interna");
    }
    @Override
    public void nacer(){
        System.out.println("Soy oviparo");
    }
}
