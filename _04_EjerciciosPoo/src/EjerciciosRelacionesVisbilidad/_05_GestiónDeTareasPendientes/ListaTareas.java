package EjerciciosRelacionesVisbilidad._05_GestiónDeTareasPendientes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; 

public class ListaTareas {
	
    private ArrayList<Tarea> tareas;
    
    public ListaTareas() {
        this.tareas = new ArrayList<Tarea>(); 
    }
    
    public void agregarTarea(Tarea tarea) {
    	this.tareas.add(tarea);
    }
    
    public void marcarTareaCompleta() {
    	
    }

    public void ListaTareas() {
        this.tareas = new ArrayList<Tarea>();
    }
    
    public boolean mostrarTareasPendientes(String descripcion) {

    	for (Tarea tarea : tareas) {
    	  if (tarea.obtenerDescripcion().equalsIgnoreCase(descripcion)) {
    		  return tarea.marcarComoCompletada();
    		}
    	}
    	
    	System.err.println("No se encontro ninguna Descripcuión ");
		return false;

    	
    }
    
    public void guardarTareas(String nombreArchivo) {
        try (PrintWriter Pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Tarea tarea : tareas) {
            	Pw.println(tarea.obtenerDescripcion() + "," + tarea.getfechaDeVencimiento() + "," + tarea.getEstado());
            }
            System.out.println("Tareas guardadas correctamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar tareas: " + e.getMessage());
        }}
    
    public void cargarTareas(String nombreArchivo) {
    	
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
    		String linea;
    		while((linea = br.readLine()) !=null) {
    			
    		}
        	
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    	
    	
    	
    }
    	 
    
    	
    
}


//cargarTareas(String nombreArchivo).
