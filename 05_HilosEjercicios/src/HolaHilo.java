public class HolaHilo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": Hola Mundo");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Ejecución con start() ===");

        HolaHilo hilo1 = new HolaHilo();
        HolaHilo hilo2 = new HolaHilo();

        hilo1.setName("Hilo-1");
        hilo2.setName("Hilo-2");

        // Lanzamos con start() para crear hilos reales
        hilo1.start();
        hilo2.start();

        // Esperamos a que terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== Ejecución con run() directamente ===");

        HolaHilo hilo3 = new HolaHilo();
        HolaHilo hilo4 = new HolaHilo();

        hilo3.setName("Hilo-3");
        hilo4.setName("Hilo-4");

        // Aquí ejecutamos los métodos run() directamente, SIN hilos nuevos
        hilo3.run();
        hilo4.run();
    }
}
