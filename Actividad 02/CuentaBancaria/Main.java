import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Marco Ortiz", "24761021", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Xenia Padilla", "123456789", 1000);
        
        cuenta1.mostrarInformacion();
        //Depsoito
        System.out.print("Ingresa la cantidad a depositar: $");
        double deposito1 = sc.nextDouble();
        cuenta1.depositar(deposito1);
        //Retiro
        System.out.print("Ingresa la cantidad a retirar: $");
        double retiro1 = sc.nextDouble();
        cuenta1.retirar(retiro1);
        System.out.println("Saldo Final: $" + cuenta1.consultarSaldo());

        System.out.println(" ");

        cuenta2.mostrarInformacion();
        // Deposito
        System.out.print("Ingresa la canidad a depositar: $");
        double deposito2 = sc.nextDouble();
        cuenta2.depositar(deposito2);
        // Retiro
        System.out.print("Ingresa la cantidad a retirar: $");
        double retiro2 = sc.nextDouble();
        cuenta2.retirar(retiro2);
        System.out.println("Salfo Final: $" + cuenta2.consultarSaldo());

        sc.close();
    }
}
