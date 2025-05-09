package ejercicio6;

class JugadorPong implements Runnable {
    private final Pelota pelota;

    public JugadorPong(Pelota pelota) {
        this.pelota = pelota;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                pelota.golpear("Pong");
            }
        } catch (InterruptedException e) {
            System.out.println("Jugador Pong interrumpido");
        }
    }
}
