package Forja;

public class Pala extends Herramientas {
    public Pala() {
        super("Pala", "Madera", 3);
    }
    @Override
    public void usar() {
        System.out.println("Excavas con la pala (Dano: " + calculo() + ")");
        desgaste();
    }
}
