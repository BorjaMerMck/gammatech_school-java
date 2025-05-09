package ejercicio6;

class JugadorPing implements Runnable {
    private final Pelota pelota;

    public JugadorPing(Pelota pelota) {
        this.pelota = pelota;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                pelota.golpear("Ping");
            }
        } catch (InterruptedException e) {
            System.out.println("Jugador Ping interrumpido");
        }
    }
}
