package Taberna;

public class Mago extends Aventurero{ 
    // Clase Hija-Mago
    private String hechizo;

    // Constructor 
    public Mago (String nombre ,int nivel , String hechizo) {
        super(nombre , nivel);
        this.hechizo = hechizo;
    }
    @Override
    public void usarHabilidad() { 
        System.out.println(nombre + " ha lanzado " + hechizo);
    }
}