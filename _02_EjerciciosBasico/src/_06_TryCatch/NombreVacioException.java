package _06_TryCatch;

class NombreVacioException extends Exception {
    public NombreVacioException(String mensaje) {
        super(mensaje);
    }
}