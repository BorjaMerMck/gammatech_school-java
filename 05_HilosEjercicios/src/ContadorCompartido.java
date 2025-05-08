class ContadorCompartido {
    int valor = 0;
}

class Incrementador implements Runnable {
    private ContadorCompartido cont;

    public Incrementador(ContadorCompartido cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            cont.valor++;  // No es seguro en concurrencia
        }
        System.out.println(Thread.currentThread().getName() + " terminó.");
    }
}

public class Main {
    public static void main(String[] args) {
        ContadorCompartido contador = new ContadorCompartido();
        Thread[] hilos = new Thread[5];

        for (int i = 0; i < 5; i++) {
            hilos[i] = new Thread(new Incrementador(contador), "Hilo-" + (i + 1));
            hilos[i].start();
        }

        // Esperamos a que todos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Valor final del contador: " + contador.valor);
    }
}
