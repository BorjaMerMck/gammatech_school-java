package es.curso.spring08;

import java.util.List;

public class Casa {
    private Direccion direccion;
    private Persona propietario;
    private double precioAlquiler;

    private List<Inquilino> inquilinos;
    private List<Persona> propietarios;
    private List<Habitacion> habitaciones;

    
    public Direccion getDireccion() {
    	return direccion; 
    }
    public void setDireccion(Direccion direccion) {
    	this.direccion = direccion; 
    }

    public List<Habitacion> getHabitaciones() {
    	return habitaciones; 
    }
    public void setHabitaciones(List<Habitacion> habitaciones) {
    	this.habitaciones = habitaciones; 
    }


    
    public Persona getPropietario() {
    	return propietario; 
    }
    public void setPropietario(Persona propietario) { 
    	this.propietario = propietario; 
    }

    public double getPrecioAlquiler() { 
    	return precioAlquiler; 
    }
    public void setPrecioAlquiler(double precioAlquiler) { 
    	this.precioAlquiler = precioAlquiler; 
    }
    
    public List<Inquilino> getInquilinos() {
    	return inquilinos; 
    }
    public void setInquilinos(List<Inquilino> inquilinos) {
    	this.inquilinos = inquilinos; 
    }



    public List<Persona> getPropietarios() { 
    	return propietarios; 
    }
    public void setPropietarios(List<Persona> propietarios) { 
    	this.propietarios = propietarios; 
    }
}
