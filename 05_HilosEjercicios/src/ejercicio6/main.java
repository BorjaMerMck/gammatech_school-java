package ejercicio6;

public class main {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();

        Thread ping = new Thread(new JugadorPing(pelota));
        Thread pong = new Thread(new JugadorPong(pelota));

        ping.start();
        pong.start();
    }
}
