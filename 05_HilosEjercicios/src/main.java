

public class main {
    public static void main(String[] args) {
        Thread pesado = new Thread(new TareaPesada(), "Pesado");
        pesado.start();

        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pesado.interrupt(); 
    }
}
