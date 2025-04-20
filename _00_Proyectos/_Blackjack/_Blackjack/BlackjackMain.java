package _Blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackjackMain {
    // Variables de clase
  private  static String[] mazoDeCartas = new String[52];
  private static int deckIndex = 0;
  private  static Scanner scanner = new Scanner(System.in);
    
    // Colores para la consola (ANSI)
    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String BLACK = "\u001B[30m";
    static final String GREEN = "\u001B[32m";
    static final String BLUE = "\u001B[34m";
    static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(YELLOW + "==================================");
        System.out.println("=           BLACKJACK           =");
        System.out.println("==================================" + RESET);
        
        crearBaraja();
        barajarMazo();
        
        String[] jugador = new String[12];
        String[] dealer = new String[12];
        int jugadorCartas = 0, dealerCartas = 0;
        
        // Repartir cartas iniciales
        jugador[jugadorCartas++] = repartirCarta();
        dealer[dealerCartas++] = repartirCarta();
        jugador[jugadorCartas++] = repartirCarta();
        dealer[dealerCartas++] = repartirCarta();
        
        // Turno del jugador
        boolean jugadorTerminado = false;
        boolean jugadorPasado = false;
        
        while (!jugadorTerminado && !jugadorPasado) {
            System.out.println("\n" + BLUE + "=== TU MANO ===" + RESET);
            mostrarCartasConColor(jugador, jugadorCartas);
            int valorJugador = calcularValorMano(jugador, jugadorCartas);
            System.out.println(GREEN + "Valor total: " + valorJugador + RESET);
            
            System.out.println("\n" + RED + "=== MANO DEL DEALER ===" + RESET);
            mostrarMano(dealer, dealerCartas, false);
            
            // Preguntar acción
            System.out.print("\n¿Quieres " + GREEN + "[P]edir" + RESET + " carta o " + YELLOW + "[Q]edarte" + RESET + "? ");
            String accion = scanner.nextLine().toUpperCase();
            
            if (accion.equals("P")) {
                jugador[jugadorCartas++] = repartirCarta();
                valorJugador = calcularValorMano(jugador, jugadorCartas);
                
                if (valorJugador > 21) {
                    System.out.println(RED + "\n¡Te has pasado de 21! (" + valorJugador + ")" + RESET);
                    jugadorPasado = true;
                }
            } else if (accion.equals("Q")) {
                jugadorTerminado = true;
            } else {
                System.out.println(RED + "Opción no válida. Introduce P o Q." + RESET);
            }
        }
        
        // Turno del dealer (solo si el jugador no se ha pasado)
        if (!jugadorPasado) {
            System.out.println("\n" + RED + "=== TURNO DEL DEALER ===" + RESET);
            mostrarCartasConColor(dealer, dealerCartas);
            int valorDealer = calcularValorMano(dealer, dealerCartas);
            System.out.println(GREEN + "Valor total: " + valorDealer + RESET);
            
            while (valorDealer < 17) {
                System.out.println("\nEl dealer pide carta...");
                dealer[dealerCartas++] = repartirCarta();
                mostrarCartasConColor(dealer, dealerCartas);
                valorDealer = calcularValorMano(dealer, dealerCartas);
                System.out.println(GREEN + "Valor total: " + valorDealer + RESET);
            }
        }
        
        // Mostrar resultado final
        System.out.println("\n" + YELLOW + "=== RESULTADO FINAL ===" + RESET);
        System.out.println(BLUE + "\nTu mano final:" + RESET);
        mostrarCartasConColor(jugador, jugadorCartas);
        int valorJugador = calcularValorMano(jugador, jugadorCartas);
        System.out.println(GREEN + "Valor total: " + valorJugador + RESET);
        
        System.out.println(RED + "\nMano final del dealer:" + RESET);
        mostrarCartasConColor(dealer, dealerCartas);
        int valorDealer = calcularValorMano(dealer, dealerCartas);
        System.out.println(GREEN + "Valor total: " + valorDealer + RESET);
        
        
        
        // Determinar el resultado
        System.out.println("\n" + YELLOW + "=== CONCLUSIÓN ===" + RESET);
        if (jugadorPasado) {
            System.out.println(RED + "¡Has perdido! Te pasaste de 21." + RESET);
        } else if (valorDealer > 21) {
            System.out.println(GREEN + "¡Ganaste! El dealer se pasó de 21." + RESET);
        } else if (valorJugador > valorDealer) {
            System.out.println(GREEN + "¡Ganaste! Tu mano es mejor." + RESET);
        } else if (valorJugador < valorDealer) {
            System.out.println(RED + "¡Perdiste! El dealer tiene mejor mano." + RESET);
        } else {
            System.out.println(YELLOW + "¡Empate! Ambos tienen el mismo valor." + RESET);
        }
        
        scanner.close();
    }
    
    private static boolean[] turnoJugador(String[] jugador, int[] jugadorCartas, String[] dealer, int dealerCartas) {
        boolean jugadorTerminado = false;
        boolean jugadorPasado = false;
        
        while (!jugadorTerminado && !jugadorPasado) {
            // Mostrar estado actual del juego
            System.out.println("\n" + BLUE + "=== TU MANO ===" + RESET);
            mostrarCartasConColor(jugador, jugadorCartas[0]);
            int valorJugador = calcularValorMano(jugador, jugadorCartas[0]);
            System.out.println(GREEN + "Valor total: " + valorJugador + RESET);
            
            System.out.println("\n" + RED + "=== MANO DEL DEALER ===" + RESET);
            mostrarMano(dealer, dealerCartas, false);
            
            // Preguntar acción al jugador
            System.out.print("\n¿Quieres " + GREEN + "[P]edir" + RESET + " carta o " + YELLOW + "[Q]edarte" + RESET + "? ");
            String accion = scanner.nextLine().toUpperCase();
            
            if (accion.equals("P")) {
                // El jugador pide otra carta
                jugador[jugadorCartas[0]++] = repartirCarta();
                valorJugador = calcularValorMano(jugador, jugadorCartas[0]);
                
                if (valorJugador > 21) {
                    System.out.println(RED + "\n¡Te has pasado de 21! (" + valorJugador + ")" + RESET);
                    jugadorPasado = true;
                }
            } else if (accion.equals("Q")) {
                // El jugador se planta
                jugadorTerminado = true;
            } else {
                System.out.println(RED + "Opción no válida. Introduce P o Q." + RESET);
            }
        }
        
        return new boolean[]{jugadorTerminado, jugadorPasado};
    }
    
    // === MÉTODOS AUXILIARES ===
    
    static void crearBaraja() {
        String[] palos = {"♠", "♥", "♦", "♣"};
        String[] rangos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;
        
        for (String palo : palos) {
            for (String rango : rangos) {
                mazoDeCartas[index++] = rango + palo;
            }
        }
    }
    
    public static void barajarMazo() {
        Random rand = new Random();
        for (int i = mazoDeCartas.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = mazoDeCartas[i];
            mazoDeCartas[i] = mazoDeCartas[j];
            mazoDeCartas[j] = temp;
        }
    }
    
    public static String repartirCarta() {
        if (deckIndex >= mazoDeCartas.length) {
            System.out.println("Se ha agotado el mazo. Barajando de nuevo...");
            crearBaraja();
            barajarMazo();
            deckIndex = 0;
        }
        return mazoDeCartas[deckIndex++];
    }
    
    public static int getValorCarta(String carta) {
        String rango = carta.substring(0, carta.length() - 1);
        switch (rango) {
            case "A": return 11;
            case "J": case "Q": case "K": return 10;
            default: return Integer.parseInt(rango);
        }
    }
    
    public static int calcularValorMano(String[] mano, int numCartas) {
        int valor = 0;
        int ases = 0;
        
        for (int i = 0; i < numCartas; i++) {
            valor += getValorCarta(mano[i]);
            if (mano[i].startsWith("A")) ases++;
        }
        
        while (valor > 21 && ases > 0) {
            valor -= 10;
            ases--;
        }
        
        return valor;
    }
    
  public  static void mostrarMano(String[] mano, int numCartas, boolean mostrarTodas) {
        // Borde superior
        for (int i = 0; i < numCartas; i++) {
            if (i == 1 && !mostrarTodas) {
                System.out.print("┌─────┐ ");
            } else {
                System.out.print("┌─────┐ ");
            }
        }
        System.out.println();
        
        // Valor/rango
        for (int i = 0; i < numCartas; i++) {
            if (i == 1 && !mostrarTodas) {
                System.out.print("│░░░░░│ ");
            } else {
                String rango = mano[i].substring(0, mano[i].length() - 1);
                System.out.printf("│%-5s│ ", rango);
            }
        }
        System.out.println();
        
        // Palo
        for (int i = 0; i < numCartas; i++) {
            if (i == 1 && !mostrarTodas) {
                System.out.print("│░░░░░│ ");
            } else {
                String palo = mano[i].substring(mano[i].length() - 1);
                System.out.printf("│  %s  │ ", palo);
            }
        }
        System.out.println();
        
        // Borde inferior
        for (int i = 0; i < numCartas; i++) {
            if (i == 1 && !mostrarTodas) {
                System.out.print("└─────┘ ");
            } else {
                System.out.print("└─────┘ ");
            }
        }
        System.out.println();
    }
    
  public  static void mostrarCartasConColor(String[] mano, int numCartas) {
        // Borde superior
        for (int i = 0; i < numCartas; i++) {
            System.out.print("┌─────┐ ");
        }
        System.out.println();
        
        // Valor/rango
        for (int i = 0; i < numCartas; i++) {
            String rango = mano[i].substring(0, mano[i].length() - 1);
            String palo = mano[i].substring(mano[i].length() - 1);
            String color = (palo.equals("♥") || palo.equals("♦")) ? YELLOW : YELLOW;
            
            System.out.printf(color + "│%-5s│ " + RESET, rango);
        }
        System.out.println();
        
        // Palo
        for (int i = 0; i < numCartas; i++) {
            String palo = mano[i].substring(mano[i].length() - 1);
            String color = (palo.equals("♥") || palo.equals("♦")) ? YELLOW : YELLOW;
            
            System.out.printf(color + "│  %s  │ " + RESET, palo);
        }
        System.out.println();
        
        // Borde inferior
        for (int i = 0; i < numCartas; i++) {
            System.out.print("└─────┘ ");
        }
        System.out.println();
    }
}