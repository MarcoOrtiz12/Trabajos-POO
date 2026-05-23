package Problematica01;

public class Competidor extends Jugador {
    private String equipo;
    // Constructor
    public Competidor(String nombre, String num_control , String nivel , String equipo) {
        super(nombre , num_control , nivel);
        this.equipo = equipo;
    }
    // Sobreescritura
    @Override
    public void mostrarPerfil() {
        super.mostrarPerfil();
        System.out.println("Equipo: " + equipo);
    }
}
