package Laboratorio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        // Primer manejo de errores
        var sc = new Scanner(System.in);
        // Inicio
        try {
            // P[rimer numero]
            System.out.println("Ingresa el primer numero: ");
            int num1 = sc.nextInt();
            // Segundo numero
            System.out.println("Ingresa el segundo numero: ");
            int num2 = sc.nextInt();
            // Resultado
            int resultado = num1 / num2;
            // Impresion del resultado
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e ) {
            System.out.println("Error: No se puede dividir entre cero");
        }catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar numeros validos");
        } finally {
            System.out.println("Programa finalizado");
            sc.close();
        }
    }
}
