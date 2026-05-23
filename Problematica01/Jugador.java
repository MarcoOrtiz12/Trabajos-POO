package Problematica01;

public class Jugador {
    // Atributos 
    protected String nombre;
    protected String num_control;
    protected String nivel;
    protected int puntos; 
    
    // Constructor
    public Jugador (String nombre, String num_control , String nivel) {
        this.nombre = nombre; 
        this.num_control = num_control;
        this.nivel = nivel;
        this.puntos = 0;
    }
    public void ganarPuntos (int cantidad) {
        puntos += cantidad;
    }
    public void perderPuntos (int cantidad) {
        puntos -= cantidad;
    }
    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de Control: " + num_control);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos: " + puntos);
    }
}
