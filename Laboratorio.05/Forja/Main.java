package Forja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Main para el uso de las herramientas
        Scanner sc = new Scanner(System.in);

        Herramientas herramienta = elegirHerramienta(sc);
        int opcion = 0;
        // Ciclo While para decidir que hacer
        while (opcion != 4) {
            // Sentencia If para ver si el arma esta rota
            if (herramienta.estaRota()) {
                System.out.println("La herramienta esta rota");
                herramienta = elegirHerramienta(sc); // Esta parte nos permite elegir otra herramienta
            }
            System.out.println("---Forja de Steve---");
            System.out.println("1.Usar herramienta");
            System.out.println("2.Ver estado");
            System.out.println("3.Guardar arma");
            System.out.println("4.Huir");
            System.out.print("Elige una opcion: ");
            int opcion1 = sc.nextInt();

            // Switch para mostrar las opciones
            switch (opcion1) {
                case 1:
                    herramienta.usar();
                    break;
                case 2:
                    herramienta.mostrarInfo();
                    break;
                case 3:
                    herramienta = elegirHerramienta(sc);
                    break;
                case 4:
                    System.out.println("Has huido, hasta luego...");
                    break;
                default:
                    System.out.println("Opcion invalida, elige de nuevo...");
                    break;
            }
        }
        sc.close();
    }
    // Metodo para elegir herramientas
    public static Herramientas elegirHerramienta(Scanner sc) {
        Herramientas h = null;
        // Ciclo While para mostrar que herramienta elegir
        while (h == null) {
            System.out.println("\nElige una herramienta:");
            System.out.println("1.Espada");
            System.out.println("2.Pico");
            System.out.println("3.Pala");
            System.out.println("4.Arco");
            System.out.print("Tu eleccion: ");
            int eleccion = sc.nextInt();
            // Sentencia Switch para las clases 
            switch (eleccion) {
                case 1:
                    h = new Espada();
                    break;
                case 2:
                    h = new Pico();
                    break;
                case 3:
                    h = new Pala();
                    break;
                case 4:
                    h = new Arco();
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo de nuevo...");
                    break;
            }
        }
        return h;
    }
}
