package Taberna;

public class main {
    public static void main(String[] args) {
        // Taberna Epica
        System.out.println("Bienvenido a la Posada del Poni Pisador");
        System.out.println("Para poder entrar debes identificarte y mostrar tu habilidad");
        System.out.println("---");

        // Perosnajes
        Guerrero g1 = new Guerrero("Jaime Lannister", 6, "Espada");
        Mago m1 = new Mago("Gandalf el Gris", 23, "Bola de Fuego");
        Arquero a1 = new Arquero("Bardo el Arquero", 10, 30);

        // Guerero 1
        g1.presentarse();
        g1.usarHabilidad();
        System.out.println("---");

        // Mago 1 
        m1.presentarse();
        m1.usarHabilidad();
        System.out.println("---");

        // Arquero 1
        a1.presentarse();
        a1.usarHabilidad();
    }
}
