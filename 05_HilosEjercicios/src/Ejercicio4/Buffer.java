package Ejercicio4;

import java.util.*;

public class Buffer {
    private final List<Integer> datos = new LinkedList<>();
    private final int capacidad = 2;

    public synchronized void producir(int x) throws InterruptedException {
        while (datos.size() == capacidad) {
            wait();
        }
        datos.add(x);
        System.out.println("Producido: " + x);
        notify(); // avisamos a un consumidor
    }

    public synchronized int consumir() throws InterruptedException {
        while (datos.isEmpty()) {
            wait();
        }
        int valor = datos.remove(0);
        System.out.println("Consumido: " + valor);
        notify(); // avisamos al productor
        return valor;
    }
}
