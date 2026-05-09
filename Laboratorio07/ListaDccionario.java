package Laboratorio07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListaDccionario {
    public static void main(String[] args) {
        // Ejercicio 2
        var sc = new Scanner(System.in);
        // Lista de 3 elementos 
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Espada");
        lista.add("Pico");
        lista.add("Pala");
        // Diccionario
        HashMap<String , String> mapa = new HashMap<>();
        mapa.put("Vida" , "100");
        mapa.put("Nivel", "5");
        mapa.put("Nombre", "Steve");
        // Intentamos correr el Programa
        try {
            // Aqui pedimos el indice
            System.out.print("Ingresa el indice(0-2): ");
            int indice = sc.nextInt();
            sc.nextLine(); // Este agregado es para limpiar el buffer
            System.out.println("Elemento: " + lista.get(indice));
            // Pedimos la clave
            System.out.print("Ingresa la clave (Vida , Nivel , Nombre): ");
            String clave = sc.nextLine();
            // sENTENCIA IF 
            if (!mapa.containsKey(clave)) {
                throw new NoSuchElementException("La clave no existe");   
            }
            System.out.println("Valor: " + mapa.get(clave));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error de indice: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Error de clave: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
            sc.close();
        }
    }
}
