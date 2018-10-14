package co.edu.sena.actividadanimales.vertebrados;

public abstract class Ornitorrinco extends Mamiferos{
    @Override
    public void desplazarse(){
    System.out.println("Me dezplazo en 4 patas ");
    }
    @Override
    public void reproducirse(){
        System.out.println("Me reproduzco de forma sexual externa");
    }
    @Override
    public void nacer(){
        System.out.println("Soy oviparo");
    }
}
