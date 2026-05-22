package Laboratorio07.Excepciones;

public class Validaciones {
    public static void validarEdad(int edad) throws EdadInvalidaError {
        if (edad < 0 || edad >120) {
            throw new EdadInvalidaError("Edad invalida: " + edad);
        }
    }
    public static void retirarDinero(double saldo, double retiro)
        throws SaldoInsuficienteError {
            if (retiro > saldo) {
                throw new SaldoInsuficienteError(" Saldo insuficiente para retirar", saldo, retiro);
            }
        }
}
    