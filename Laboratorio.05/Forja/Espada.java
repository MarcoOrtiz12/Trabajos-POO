package Forja;

public class Espada extends Herramientas {
    public Espada() {
        super("Espada" , "Hierro" , 5);
    }
    @Override
    public void usar() {
        System.out.println("Atacas con la espada (Dano: " + calculo() + ")");
        desgaste();
    }
}
