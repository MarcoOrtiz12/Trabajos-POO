package Mascota;

public class Mascota {

    private String nombre;
    private String tipo;
    private String raza;
    private int edad;
    private int nivelFelicidad;

    public Mascota(String nombre, String tipo, String raza, int edad, int nivelFelicidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;

        if (nivelFelicidad > 100) {
            this.nivelFelicidad = 100;
        } else if (nivelFelicidad < 0) {
            this.nivelFelicidad = 0;
        } else {
            this.nivelFelicidad = nivelFelicidad;
        }
    }

    private void ajustar(int cambio) {
        nivelFelicidad += cambio;
    }

    public void alimentar() {
        ajustar(10);
        System.out.println("Has alimentado a tu mascota");
    }

    public void noAlimentar() {
        ajustar(-10);
        System.out.println("No has alimentado a tu mascota :(");
    }

    public void jugar() {
        ajustar(10);
        System.out.println("Has jugado con tu mascota");
    }

    public void noJugar() {
        ajustar(-10);
        System.out.println("No has jugado con tu mascota :(");
    }

    public int mostrarEstado() {
        return nivelFelicidad;
    }

    public boolean esFeliz() {
        return nivelFelicidad >= 70;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de mascota: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("Nivel de felicidad actual: " + nivelFelicidad);
    }
}