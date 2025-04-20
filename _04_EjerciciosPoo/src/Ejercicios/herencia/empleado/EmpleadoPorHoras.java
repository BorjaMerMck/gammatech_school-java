package Ejercicios.herencia.empleado;


public class EmpleadoPorHoras extends Empleado {
    private double eurosHora;
    private double horasMensualesExtras;

    public EmpleadoPorHoras(String nombre, int edad, double salarioBase, double horasMensualesExtras) {
        super(nombre, edad, salarioBase);
        this.eurosHora = 8.49;
        this.horasMensualesExtras = horasMensualesExtras;
    }

    public double getEurosHora() {
        return eurosHora;
    }

    public void setEurosHora(double eurosHora) {
        this.eurosHora = eurosHora;
    }

    public double getHorasMensuales() {
        return horasMensualesExtras;
    }

    public void setHorasMensuales(double horasMensuales) {
        this.horasMensualesExtras = horasMensuales;
    }

    public double calcularSalarioExtra() {
        return salarioBase + this.eurosHora * this.horasMensualesExtras;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSalario por hora: " + this.eurosHora +
               ", Horas extras: " + this.horasMensualesExtras +
               ", Salario final: " + calcularSalarioExtra();
    }
}