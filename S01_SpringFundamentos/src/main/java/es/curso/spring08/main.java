package es.curso.spring08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext08.xml");

        Casa casa = (Casa) context.getBean("casa");

        System.out.println("=== Información de la casa ===");
        System.out.println("Dirección: " + casa.getDireccion().getTipoVia() + " " +
                casa.getDireccion().getNombreVia() + ", " +
                casa.getDireccion().getNumero() + ", CP: " +
                casa.getDireccion().getCodigoPostal());

        System.out.println("Precio alquiler: " + casa.getPrecioAlquiler() + "€");

        System.out.println("\n--- Habitaciones de la casa ---");
        for (Habitacion h : casa.getHabitaciones()) {
            System.out.println("Hab. #" + h.getNumeroHabitacion() + " (" +
                    h.getTipoHabitacion() + ") - " +
                    h.getMetrosCuadrados() + " mCuadrados");
            		
        }

        System.out.println("\n--- Inquilinos ---");
        for (Inquilino i : casa.getInquilinos()) {
            System.out.println(i.getNombre() + " (DNI: " + i.getDni() + ", Telefono: " + i.getTelefono() + ")");
        }
        
        
        
        Persona p = casa.getPropietario();
        System.out.println("\nPropietario de la casa: " + p.getNombre() + " (DNI: " +
                p.getDni() + ", Telefono: " + p.getTelefono() + ")");
    }
}
