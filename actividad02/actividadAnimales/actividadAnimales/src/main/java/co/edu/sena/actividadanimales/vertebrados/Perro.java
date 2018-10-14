package co.edu.sena.actividadanimales.vertebrados;

public abstract class Perro extends Mamiferos {
    public static final  int PATAS=4;
    private String raza;
    
    @Override
    public void desplazarse(){
    System.out.println("Me desplazo en " +PATAS+" patas");
    }
    public String getRaza(){
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
}
