package Ejercicio4;

public class main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread productor = new Thread(new Productor(buffer), "Productor");
        Thread consumidor1 = new Thread(new Consumidor(buffer), "Consumidor-1");
        Thread consumidor2 = new Thread(new Consumidor(buffer), "Consumidor-2");

        productor.start();
        consumidor1.start();
        consumidor2.start();
    }
}
