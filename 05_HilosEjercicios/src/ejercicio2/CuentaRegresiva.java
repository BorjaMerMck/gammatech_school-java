package ejercicio2;

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
}
