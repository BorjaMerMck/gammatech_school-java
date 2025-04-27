package app;



import java.util.Scanner;
import model.*;
import enums.EstadoRecurso;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaManager manager = new BibliotecaManager();


        manager.agregarUsuario(new Usuario("U001", "Borja Merchann Mckenna"));
        manager.agregarUsuario(new Usuario("U002", "Frankie Merchan Mckenna"));


        manager.agregarRecurso(new Libro("L001", "El Quijote", "Cervantes"));
        manager.agregarRecurso(new Libro("L002", "1984", "George Orwell"));


        manager.agregarRecurso(new Revista("R001", "National Geographic", 120));
        manager.agregarRecurso(new Revista("R002", "Muy Interesante", 210));

        manager.agregarRecurso(new DVD("D001", "Matrix", 136));
        manager.agregarRecurso(new DVD("D002", "El Señor de los Anillos", 180));

       
        manager.mostrarMenu(); 

        
        
    }       
}
    
   
