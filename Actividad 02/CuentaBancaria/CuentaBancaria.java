

public class CuentaBancaria {
    // Atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
          //  System.out.println("Deposito de $" + monto + " realizado");
        } else {
            System.out.println("El monto debe ser mayor a cero");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            // System.out.println("Retiro de $"  + monto + " realizado");
        } else {
            System.out.println("Fondos insuficientes o monto invalido");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
    }
}

