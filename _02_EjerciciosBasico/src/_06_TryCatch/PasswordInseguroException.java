package _06_TryCatch;


public class PasswordInseguroException extends Exception {
	
    public PasswordInseguroException(String mensaje) {
        super(mensaje);
    }

}