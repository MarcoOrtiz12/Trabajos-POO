package Mascota;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Mascoas
        Mascota mascota1 = new Mascota("Robb", "Perro", "Perro amarillo", 12, 50);
        Mascota mascota2 = new Mascota("Firulais", "Perro", "Border Collie", 4, 70);
        Mascota mascota3 = new Mascota("Orome", "Gato", "Gato rayado", 6, 90);

        interactuar(mascota1, sc);
        interactuar(mascota2, sc);
        interactuar(mascota3, sc);

        sc.close();
    }
    // Seccion ara la fncion Ineracar
    public static void interactuar(Mascota mascota, Scanner sc) {

    mascota.mostrarInformacion();
    boolean salir = false;

    // Validacion para ver si se debe continuar
    if (mascota.mostrarEstado() >= 100) {
        System.out.println("Felicdad completa, no es necesaria otra accion.");
    } else {

        // Alimentar
        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1. Alimentar");
            System.out.println("2. No alimentar");
            System.out.print("Elige que quieres hacer: ");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    mascota.alimentar();
                    salir = true;
                    break;
                case 2:
                    mascota.noAlimentar();
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

        salir = false;

        // Juego
        if (mascota.mostrarEstado() < 100) {
            while (!salir) {
                System.out.println("Juego:");
                System.out.println("1. Jugar");
                System.out.println("2. No jugar");
                System.out.print("Elige que quieres hacer: ");
                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        mascota.jugar();
                        salir = true;
                        break;
                    case 2:
                        mascota.noJugar();
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }
            } 
            else {
            System.out.println("Nivel de felicidad completa, no es necesario otra accion");
         }
    }
        System.out.println("Nivel de felicidad final: " + mascota.mostrarEstado());

        if (mascota.esFeliz()) {
            System.out.println("La mascota es feliz");
        } else {
            System.out.println("La mascota no es feliz");
        }

        System.out.println(" ");
    }

}

