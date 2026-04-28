package Menu;

public class Main {
    public static void main(String[] args) {
        // Inicimaos el proceso
        System.out.println("Bienvenido a Cielito Lindo");
        Comida c1 = new Comida("Hamburguesa" , 120f , "Principal");
        Bebida b1 = new Bebida("Coca Cola", 20, "Fria");
        Postre p1 = new Postre("Pay de Manzana", 55, true);

        // Primera Comida
        c1.mostrarInfor();
        c1.tipo();
        //Primera Bebida
        b1.mostrarInfor();
        b1.tipo();
        // Primer postr
        p1.mostrarInfor();
        p1.tipo();
    }
}
