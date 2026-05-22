package Laboratorio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Entrada
        int num1 = pedirEntero("Ingresa el primer número: ");
        int num2 = pedirEntero("Ingresa el segundo número: ");

        // Menu
        System.out.println("\nElige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");

        int eleccion = pedirEntero("Tu elección: ");

        switch (eleccion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }

    // Funcion reutilizable
    public static int pedirEntero(String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;

            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido.");
                sc.nextLine(); // limpiar entrada incorrecta
            }
        }
    }
}