package Herencia;

// import Herencia.Animal;

public class Gato extends Animal {
    public Gato (String nombre , int edad) {
        super(nombre , edad);
    }
    public void maullar() {
        System.out.println(nombre + "tiene "+ "dice: Miau");
    }
}
