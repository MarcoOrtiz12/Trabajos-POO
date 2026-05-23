package Problematica01;

public class Main {
    public static void main(String[] args) {
        Competidor c1 = new Competidor("Marco Ortiz", "24761021", "Medio", "Team Sangre");
        Competidor c2 = new Competidor("Raul Perez", "22765091", "Medio`", "Los Sistematicos");
        Observador o1 = new Observador("Xenia Padilla", "21456098", "Experta");
        Observador o2 = new Observador("Alberto Hernandez", "20346521", "Principiante");

        System.out.println("Competidores: ");
        // cOMPETIDOR 1
        System.out.println("\nParticipante No. 1");
        c1.ganarPuntos(20);
        c1.mostrarPerfil();

        // cOMPETIDOR 2
        System.out.println("\nParticipante No.2");
        c2.ganarPuntos(20);
        c2.perderPuntos(15);
        c2.mostrarPerfil();

        // Observadores
        // Observador 1
        System.out.println("\nPublicooo");
        System.out.println("\nObservador No. 1");
        o1.verPartida();
        o1.verPartida();
        o1.mostrarPerfil();

        // Observador 2
        System.out.println("\nObservador No.2");
        o2.verPartida();
        o2.mostrarPerfil();



    }
}
