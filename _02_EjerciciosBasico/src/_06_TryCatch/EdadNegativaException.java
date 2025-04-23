package _06_TryCatch;

class EdadNegativaException extends Exception {
    public EdadNegativaException(String mensaje) {
        super(mensaje);
    }
}