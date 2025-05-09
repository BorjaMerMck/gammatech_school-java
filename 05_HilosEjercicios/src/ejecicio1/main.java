package ejecicio1;

public class main {
    public static void main(String[] args) {
        System.out.println("  start()");
        HolaHilo hilo1 = new HolaHilo();
        HolaHilo hilo2 = new HolaHilo();

        hilo1.setName("Hilo 1");
        hilo2.setName("Hilo 2");

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n run()");
        HolaHilo hilo3 = new HolaHilo();
        HolaHilo hilo4 = new HolaHilo();

        hilo3.setName("Hilo 3");
        hilo4.setName("Hilo 4");

        hilo3.run(); 
        hilo4.run(); 
    }
}
