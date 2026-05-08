package Forja;

public class Pico extends Herramientas {
    public Pico() {
        super("Pico" , "Piedra" , 4);
    }
    @Override
    public void usar() {
        System.out.println("Minas con el pico (Dano: " + calculo() + ")");
        desgaste();
    }
}
