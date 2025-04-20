package Ejercicios.herencia.empleado;


public class EmpleadoTiempoCompleto extends Empleado {
    private double bonoAnual;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salarioBase, double bonoAnual) {
        super(nombre, edad, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    public double getBonoAnual() {
        return bonoAnual;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString() + ", Bono Anual: " + bonoAnual + " (Tiempo Completo)";
    }
}