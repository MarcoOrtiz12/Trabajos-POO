package Menu;

public class Bebida extends platillo {
    // Clase Hija-Bebida
    private String temperatura;
    // Constructor
    public Bebida (String nombre, float precio , String temperatura) {
        super(nombre, precio);
        this.temperatura = temperatura;
    }
    @Override
    public void tipo() {
        System.out.println("Tipo: Bebida - " + temperatura);
    }
}
