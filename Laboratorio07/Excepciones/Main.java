package Laboratorio07.Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Edad
            System.out.print("Ingresa tu edad: ");
            int edad = sc.nextInt();

            Validaciones.validarEdad(edad);
            System.out.println("Edad valida");
            // Saldo
            System.out.print("\nIngresa tu saldo: ");
            double saldo = sc.nextDouble();

            System.out.print("Monto a retirar: ");
            double retiro = sc.nextDouble();
            
            Validaciones.retirarDinero(saldo, retiro);
            System.out.println("Retiro realizado correctamente");
        } catch (EdadInvalidaError e) {
            System.out.println("Error de edad: " + e.getMessage());
        } catch (SaldoInsuficienteError e) {
            System.out.println("Error de saldo: " + e.getMessage());
            System.out.println("Saldo actual: " + e.getSaldoActual());
            System.out.println("Intentaste retirar: " + e.getMontoRetiro());
        } catch (Exception e) {
            System.out.println("Error inesperado:" + e.getMessage());
        } finally {
            System.out.println("\nPrograma finalizado");
            sc.close();
        }
    }
}
