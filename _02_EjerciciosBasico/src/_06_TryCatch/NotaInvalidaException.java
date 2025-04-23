package _06_TryCatch;

class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }
}