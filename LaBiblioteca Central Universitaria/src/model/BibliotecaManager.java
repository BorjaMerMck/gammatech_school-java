package model;

import enums.EstadoRecurso;
import interfaces.Prestamista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase que gestiona todos los recursos y usuarios de la biblioteca.
 * Implementa {@link Prestamista}.
 * Controla el flujo de préstamos, devoluciones y listados.
 * 
 * @author Borja Merchan Mckkenna
 * @version 1.0
 * @since 1.0
 */
public class BibliotecaManager implements Prestamista {
    private Map<String, RecursoBiblioteca> recursos;
    private Map<String, Usuario> usuarios;

    /**
     * Constructor para inicializar los mapas de recursos y usuarios.
     */
    
    public BibliotecaManager() {
        recursos = new HashMap<>();
        usuarios = new HashMap<>();
    }
    
    /**
     * Devuelve un recurso prestado a la biblioteca.
     *
     * @param recurso El recurso a devolver.
     * @return true si la devolución fue exitosa, false si no estaba prestado.
     */
    
    @Override
    public boolean prestar(RecursoBiblioteca recurso, Usuario usuario) {
        if (recurso.getEstado() == EstadoRecurso.DISPONIBLE) {
            recurso.setEstado(EstadoRecurso.PRESTADO);
            System.out.println("Préstamo realizado: " + recurso.getTitulo() + " a " + usuario.getNombre());
            return true;
        } else {
            System.out.println("El recurso no está disponible para préstamo.");
            return false;
        }
    }
    
    /**
     * Devuelve un recurso prestado a la biblioteca.
     *
     * @param recurso El recurso a devolver.
     * @return true si la devolución fue exitosa, false si no estaba prestado.
     */
    
    @Override
    public boolean devolver(RecursoBiblioteca recurso) {
        if (recurso.getEstado() == EstadoRecurso.PRESTADO) {
            recurso.setEstado(EstadoRecurso.DISPONIBLE);
            System.out.println("Devolución realizada: " + recurso.getTitulo());
            return true;
        } else {
            System.out.println("Este recurso no estaba prestado.");
            return false;
        }
    }


    /**
     * Agrega un nuevo recurso al sistema.
     *
     * @param recurso Recurso a agregar.
     */
    
    
    public void agregarRecurso(RecursoBiblioteca recurso) {
        recursos.put(recurso.getId(), recurso);
    }

    
    /**
     * Agrega un nuevo usuario al sistema.
     *
     * @param usuario Usuario a agregar.
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    /**
     * Busca un recurso en la biblioteca mediante su ID.
     *
     * @param id ID del recurso.
     * @return El recurso encontrado o null si no existe.
     */
   
    public RecursoBiblioteca obtenerRecurso(String id) {
        return recursos.get(id);
    }

    /**
     * Busca un usuario en la biblioteca mediante su ID.
     *
     * @param id ID del usuario.
     * @return El usuario encontrado o null si no existe.
     */
    public Usuario obtenerUsuario(String id) {
        return usuarios.get(id);
    }


    /**
     * Lista todos los recursos de la biblioteca con su estado actual.
     */
    
    public void listarRecursos() {
        for (RecursoBiblioteca recurso : recursos.values()) {
            System.out.println(recurso.descripcion());
        }
    }
    
    /**
     * Muestra un menú interactivo en consola para realizar operaciones sobre recursos y usuarios,
     * incluyendo prestar, devolver, listar y salir del programa.
     * Controla entradas inválidas mediante excepciones.
     */
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Menu:\n" +
                        "\tListar\n" +
                        "\tprestar\n" +
                        "\tdevolver\n" +
                        "\tsalir");
                System.out.print("Introduzca la opción que quieras: ");
                String[] input = scanner.nextLine().split(" ");
                String comando = input[0];

                switch (comando) {
                	case "prestar":
	                    if (input.length < 3) {
	                        System.out.println("Uso correcto: prestar <idRecurso> <idUsuario>");
	                        break;
	                    }
	                    
	                    RecursoBiblioteca recurso = obtenerRecurso(input[1]);
	                    Usuario usuario = obtenerUsuario(input[2]);
	                    
	                    if (recurso == null || usuario == null) {
	                        System.out.println("Error: recurso o usuario no encontrado.");
	                        break;
	                    }
	                    
	                    this.prestar(recurso, usuario);
	                    break;

                    case "devolver":
                        if (input.length < 2) {
                            System.out.println("Uso correcto: devolver <idRecurso>");
                            break;
                        }
                        this.devolver(this.obtenerRecurso(input[1]));
                        break;

                    case "listar":
                        this.listarRecursos();
                        break;

                    case "salir":
                        System.out.println("¡Adiós!");
                        return;

                    default:
                        System.out.println("Comando no reconocido.");
                }
            } while (true);

        } catch (NullPointerException e) {
            System.err.println("Has introducido mal el orden o algún elemento es nulo.");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
    
    


        
    
}
