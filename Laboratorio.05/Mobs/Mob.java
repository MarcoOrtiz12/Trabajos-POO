package Mobs;

public abstract class Mob {
    // Atributos
    protected String nombre;
    protected int vida;
    protected String sonido;
    protected String tipo;
    protected String movimiento;

    // Constructor
    public Mob (String nombre, int vida, String sonido, String tipo, String movimiento) {
        this.nombre = nombre;
        this.vida = vida;
        this.sonido = sonido;
        this.tipo = tipo;
        this.movimiento = movimiento;
    }
    // Mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Sonido: " + sonido);
        System.out.println("Tipo: " + tipo);
        System.out.println("Movimiento: " + movimiento);
    }
}
