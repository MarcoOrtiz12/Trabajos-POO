package Herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Seccion para escribir
        var sc = new Scanner(System.in);

        // Mascotas
        System.out.println("Mascotas: ");
        Perro perro1 = new Perro("Solovino", 5);
        Gato gato1 = new Gato("Orome", 4);

        perro1.ladrar();
        gato1.maullar();

        sc.close();
    }
}
