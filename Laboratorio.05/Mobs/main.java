package Mobs;

public class main {
    public static void main(String[] args) {
        // Clases
        Mob vaca = new Vaca();
        Mob creeper = new Creeper();
        Mob enderman = new Enderman();
        Mob lobo = new Lobo();

        // Imprimir los resultados 
        vaca.mostrarInfo();
        System.out.println("");
        creeper.mostrarInfo();
        System.out.println("");
        enderman.mostrarInfo();
        System.out.println("");
        lobo.mostrarInfo();
        System.out.println("");
        System.out.println(" ");
    }
}
