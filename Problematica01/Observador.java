package Problematica01;

public class Observador extends Jugador {
    private int partidas_vistas;

    //Constructor
    public Observador(String nombre , String num_control , String nivel) {
        super(nombre, num_control, nivel);
        this.partidas_vistas = 0;
    }
    // Metodo extra solicitado
    public void verPartida () {
        partidas_vistas++;
        ganarPuntos(5);
        System.out.println(nombre + " ha visto " + partidas_vistas + " partidas");
    }
    //Sobreescritura
    public void mostrarPerfil() {
        super.mostrarPerfil();
        System.out.println("Partidas vistas: " + partidas_vistas);
    }
}
