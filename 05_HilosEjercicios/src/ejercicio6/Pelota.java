package ejercicio6;

public class Pelota {
    private boolean pingTurno = true; // true = le toca a Ping, false = le toca a Pong

    public synchronized void golpear(String jugador) throws InterruptedException {
        while ((pingTurno && jugador.equals("Pong")) || (!pingTurno && jugador.equals("Ping"))) {
            wait();
        }

        System.out.println(jugador.equals("Ping") ? "Ping" : "Pong");

        pingTurno = !pingTurno; // Cambia el turno
        notify(); // Despierta al otro hilo
    }
}
