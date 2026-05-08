package Forja;

public abstract class Herramientas {
    // Clase abstracta que se usa como basepara las demas herramientas
    protected String nombre;
    protected String material;
    protected int durabilidad;

    // Constructor 
    public Herramientas (String nombre , String material , int durabilidad) {
        this.nombre = nombre;
        this.material = material;
        this.durabilidad = durabilidad;
    }
    // Metodo abstracto
    public abstract void usar();
    // Calcular dano
    public int calculo() {
        switch (material.toLowerCase()) {
            case "madera" : return 2;
            case "piedra" : return 4;
            case "hierro" : return 6;
            case "diamante" : return 8;
            default : return 1;
        }
    }
    // Desgaste
    public void desgaste() {
    if (durabilidad > 0) {
        durabilidad--;
        }
    }
    // Boolean para determinar si la herramienta esta rota
    public boolean estaRota() {
        return durabilidad <= 0;
    }
    // Mostrar la informacion de la herramienta
    public void mostrarInfo() {
        System.out.println("Herramienta: " + nombre);
        System.out.println("Tipo: " + material);
        System.out.println("Nivel de durabilidad: " + durabilidad);
        System.out.println("Dano: " + calculo());
    }
}
