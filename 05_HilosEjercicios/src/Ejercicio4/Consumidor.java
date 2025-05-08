package Ejercicio4;

class Consumidor implements Runnable {
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consumir();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumidor interrumpido.");
        }
    }
}
