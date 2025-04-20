package Ejercicios.herencia.empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Borja", 26, 32000, 3000.0);
        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial("Sara", 24, 15000.0, 20);
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Hugo", 23, 1049.0, 20.0);

        System.out.println("==== Tiempo Completo ====");
        System.out.println(empleado1);

        System.out.println("\n==== Tiempo Parcial ====");
        System.out.println(empleado2);

        System.out.println("\n==== Por Horas ====");
        System.out.println(empleado3);
    }
}