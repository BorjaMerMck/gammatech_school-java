package ejercicio3b;

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

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}

