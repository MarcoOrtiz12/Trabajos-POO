package Laboratorio07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner lector = null;
        try {
            // Aqui solicitamos el archivo
            System.out.print("Ingresa el nombre del archivo: ");
            String nombreArchivo = sc.nextLine();

            File archivo = new File(nombreArchivo);
            lector = new Scanner(archivo);

            System.out.println("\nContenido del archivo:\n");

            int contadorLineas = 0;

            // Lectura
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
                contadorLineas++;
            }
            if (contadorLineas == 0) {
                System.out.println("El archivo está vacío.");
            } else {
                System.out.println("\nTotal de líneas leídas: " + contadorLineas);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado. Verifica el nombre o la ruta");

        } finally {
            // Cierre
            if (lector != null) {
                lector.close();
            }
            sc.close();
            System.out.println("\nIntento de lectura finalizado");
        }
    }
}