package Laboratorio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Ejercicio 03
        // Solicitamos que los usuarios ingresen los numeros
        int num1 = pedirEntero("Ingresa el primer numero: ");
        int num2 = pedirEntero("Ingresa el segundo numero: ");
        // Menu para realizar la Calculadora
        System.out.println("\nElige una operacion");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("Tu eleccion: ");
        int eleccion = sc.nextInt();
        // Switch para realizar una accion 
        switch (eleccion) {
            case 1:
                System.out.println("Suma: " + (num1 + num2));
                break;
            case 2: 
                System.out.println("Resta: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicacion: " + (num1 * num2));
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
// Esta parte es para la funcion reutilizable
public static int pedirEntero(String mensaje) {
    while (true) {
        try {
            if (mensaje.isEmpty()) {
                System.out.println(mensaje);
            }
            int numero = sc.nextInt();
            return numero; 
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero valido...");
            sc.nextLine();
            }
        }
    }
}
