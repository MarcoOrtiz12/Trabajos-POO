package Laboratorio07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListaDiccionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Espada");
        lista.add("Pico");
        lista.add("Pala");

        // Diccionario
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("vida", "100");
        mapa.put("nivel", "5");
        mapa.put("nombre", "Steve");

        try {
            // Indice 
            System.out.print("Ingresa un índice (0-2): ");
            int indice = sc.nextInt();
            sc.nextLine();

            if (indice < 0 || indice >= lista.size()) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }

            System.out.println("Elemento: " + lista.get(indice));

            // Clave
            System.out.print("\nIngresa una clave (vida, nivel, nombre): ");
            String clave = sc.nextLine().toLowerCase();

            if (!mapa.containsKey(clave)) {
                throw new NoSuchElementException("La clave \"" + clave + "\" no existe");
            }

            System.out.println("Valor: " + mapa.get(clave));

        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número válido.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("\nPrograma finalizado");
            sc.close();
        }
    }
}