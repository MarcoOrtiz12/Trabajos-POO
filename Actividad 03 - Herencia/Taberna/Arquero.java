package Taberna;

public class Arquero extends Aventurero {
    // Clase Hija-Arquero
    private int flechas = 30;

    public Arquero (String nombre, int nivel , int flechas) {
        super(nombre , nivel);
        this.flechas = flechas;
    }
    // Uso de habilidad
    @Override
    public void usarHabilidad() {
        flechas -= 1;
        System.out.println(nombre + " lanzo una flecha. Le quedan: " + flechas);
    }
}
