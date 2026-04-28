package Menu;

public class platillo { 
    // Atributos 
    protected String nombre;
    protected float precio;

    public platillo (String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Creamos los metodos 
    public void mostrarInfor() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }
    public void tipo() { 
        System.out.println();
    }

}