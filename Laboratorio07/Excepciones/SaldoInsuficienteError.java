package Laboratorio07.Excepciones;

public class SaldoInsuficienteError extends Exception{
    private double saldoActual;
    private double montoRetiro;

    public SaldoInsuficienteError(String mensaje , double saldoActual , double montoRetiro) {
        super(mensaje);
        this.saldoActual = saldoActual;
        this.montoRetiro = montoRetiro;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public double getMontoRetiro() {
        return montoRetiro;
    }
}
