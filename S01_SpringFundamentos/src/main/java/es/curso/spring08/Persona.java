package es.curso.spring08;

public class Persona {
    private String nombre;
    private String dni;
    private String telefono;
    private Direccion direccion;

    public String getNombre() { 
    	return nombre; 
    }
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public String getDni() { 
    	return dni; 
    }
    public void setDni(String dni) { 
    	this.dni = dni;
    }

    public String getTelefono() { 
    	return telefono; 
    }
    public void setTelefono(String telefono) { 
    	this.telefono = telefono; 
    }

    public Direccion getDireccion() { 
    	return direccion; 
    }
    public void setDireccion(Direccion direccion) { 
    	this.direccion = direccion; 
    }
}
