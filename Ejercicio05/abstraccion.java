package Ejercicio05;

public class abstraccion {
    public static void main(String[] args) {
        // Mascotas
        animal Perro = new Perro();
        animal Gato = new Gato();

        // Mandar a llamar a las hijas
        Perro.hacerRuido();
        Gato.hacerRuido();
    }
}
