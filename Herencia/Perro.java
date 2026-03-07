package Herencia;

// import Herencia.Animal;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public void ladrar() {
        System.out.println(nombre + "tiene " + edad + "años y dice: Gua Guau");
    }
}
