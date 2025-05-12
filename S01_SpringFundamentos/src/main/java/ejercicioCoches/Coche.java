package ejercicioCoches;


public class Coche implements Comparable<Coche> {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;

    public Coche(String matricula, String marca, String modelo, int kilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public String getMatricula() {
    	return matricula; 
    }
    public String getMarca() { 
    	return marca; 
    }
    public String getModelo() { 
    	return modelo; 
    }
    public int getKilometros() { 
    	return kilometros; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Coche)) return false;
        Coche otro = (Coche) obj;
        return this.matricula.equalsIgnoreCase(otro.matricula);
    }

    @Override
    public int hashCode() {
        return matricula.toLowerCase().hashCode();
    }

    @Override
    public int compareTo(Coche otro) {
        return this.matricula.compareToIgnoreCase(otro.matricula); 
    }

    @Override
    public String toString() {
        return "[Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", KM: " + kilometros + "]";
    }
}
