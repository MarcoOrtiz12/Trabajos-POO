package Menu;

public class Comida extends platillo {
    // Clase Hija
    private String catgoria;

    // Constructor 
    public Comida( String nombre ,  float precio , String categoria) {
        super(nombre, precio);
        this.catgoria = categoria;
    }
    @Override
    public void tipo() {
        System.out.println("Tipo: Comida - " + catgoria );
    }
}
