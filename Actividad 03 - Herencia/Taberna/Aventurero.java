package Taberna;

public class Aventurero {
    // Atributos de los personajes
    protected String nombre;
    protected int nivel;

    // Constructor
    public Aventurero ( String nombre , int nivel ) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    // Presentacion de los personajes
    public void presentarse() { 
        System.out.println("Valar Morghulis, mi nombre es " + nombre + " y soy un personaje de nivel " + nivel);
    }

    // Uso de habilidad
    public void usarHabilidad() {
        System.out.println();
    }
}
