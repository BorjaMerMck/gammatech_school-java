package Ejercicio4;

class Productor implements Runnable {
    private final Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int valor = 0;
        try {
            while (true) {
                buffer.producir(valor++);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Productor interrumpido.");
        }
    }
}
