package ejercicio2;

public static void main(String[] args) {
    CuentaRegresiva tarea = new CuentaRegresiva(5);
    Thread hilo = new Thread(tarea);
    hilo.setName("Contador");
    hilo.start();
}
}
