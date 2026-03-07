package Menu;

public class Postre extends platillo {
    // Clase Hija-Postre
    private boolean gluten;
    //Constructor
    public Postre(String nombre, float precio , boolean gluten) {
        super(nombre , precio);
        this.gluten = gluten;
    }
    @Override
    public void tipo() {
        if (gluten) {
            System.out.println("Tipo: Postre - Gluten: Si" );
        }
        else {
            System.out.println("Tipo: Postre - Gluten: No");
        }
    }
}