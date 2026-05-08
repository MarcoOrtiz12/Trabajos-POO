package Forja;

public class Arco extends Herramientas {
    // Variable para determinar la cantidad de flechas
    private int flechas;
    public Arco() {
        super("Arco", "Madera", 6);
        this.flechas = 6;
    }
    @Override
    public void usar() {
        // Sentencia if para determinar si aun quedan felcahs
        if (flechas <= 0) {
            System.out.println("Sin flechas");
            return;
        }
        System.out.println("Disparas una flecha (Dano: " + calculo() + ")");
        flechas--;
        desgaste();
    }
}
