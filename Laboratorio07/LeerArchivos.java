package Laboratorio07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Comenzamos pidiendo el nombre del archivo 
        System.out.print("Ingresa el nombre del archivo: " );
        String nombreArchivo = sc.nextLine();
        Scanner lector = null;
        // Intentamos correr el programa
        try {
            File archivo = new File(nombreArchivo);
            lector = new Scanner(archivo);
            System.out.println("\nContenido del archivo:");
            // Ciclo while
            while (lector.hasNextLine()) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe...");
        } finally {
            System.out.println("Intento de lectura finalizado");
        }
        sc.close();
    }
}
