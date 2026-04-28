package Taberna;

public class Guerrero extends Aventurero {
    //Clase Hija-Guerrero
    private String arma;

    // Constructor
    public Guerrero (String nombre , int nivel , String arma) {
        super(nombre, nivel);
        this.arma = arma;
     }
     @Override
     public void usarHabilidad() {
        System.out.println(nombre + " ha usado su " + arma);
     }

}
