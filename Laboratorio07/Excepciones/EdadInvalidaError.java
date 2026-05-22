package Laboratorio07.Excepciones;

public class EdadInvalidaError extends Exception {
    public EdadInvalidaError(String mensaje) {
        super(mensaje);
    }
}