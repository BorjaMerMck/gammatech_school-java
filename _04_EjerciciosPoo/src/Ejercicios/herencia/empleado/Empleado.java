package Ejercicios.herencia.empleado;


public class Empleado {
    public String nombre;
    public int edad;
    protected double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salarioBase=" + salarioBase + "]";
    }
}