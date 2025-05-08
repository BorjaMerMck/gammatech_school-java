public class CuentaRegresiva implements Runnable {
    private int n;

    public CuentaRegresiva(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            for (int i = n; i >= 0; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(500); // Pausa de 500 milisegundos
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ": Interrumpido.");
        }
    }

    public static void main(String[] args) {
        CuentaRegresiva tarea = new CuentaRegresiva(5);
        Thread hilo = new Thread(tarea);
        hilo.setName("Contador");
        hilo.start();
    }
}
