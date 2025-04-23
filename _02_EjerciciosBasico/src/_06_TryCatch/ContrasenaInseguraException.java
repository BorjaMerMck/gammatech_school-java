package _06_TryCatch;

class ContrasenaInseguraException extends Exception {
    public ContrasenaInseguraException(String mensaje) {
        super(mensaje);
    }
}